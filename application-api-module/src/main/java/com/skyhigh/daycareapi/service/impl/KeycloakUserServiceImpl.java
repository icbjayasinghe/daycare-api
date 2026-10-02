package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.User;
import com.skyhigh.daycareapi.model.constants.Role;
import com.skyhigh.daycareapi.model.dto.LoginRequestDto;
import com.skyhigh.daycareapi.service.KeycloakUserService;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Map;

@Service
public class KeycloakUserServiceImpl implements KeycloakUserService {

    private final Keycloak keycloak;
    private final RestClient restClient;

    private final String serverUrl;
    private final String realm;
    private final String clientId;
    private final String clientSecret;

    public KeycloakUserServiceImpl(
            RestClient.Builder restClientBuilder,
            @Value("${spring.security.oauth2.resourceserver-url}") String serverUrl,
            @Value("${keycloak.realm}") String realm,
            @Value("${springdoc.swagger-ui.oauth.client-id}") String clientId,
            @Value("${springdoc.swagger-ui.oauth.client-secret}") String clientSecret) {

        this.serverUrl = serverUrl;
        this.realm = realm;
        this.clientId = clientId;
        this.clientSecret = clientSecret;

        this.keycloak = KeycloakBuilder.builder()
                .serverUrl(serverUrl)
                .realm(realm)
                .grantType(OAuth2Constants.CLIENT_CREDENTIALS)
                .clientId(clientId)
                .clientSecret(clientSecret)
                .build();

        this.restClient = restClientBuilder.build();
    }

    @Override
    public Map<String, Object> login(LoginRequestDto request) {
        String tokenUrl = serverUrl
                + "/realms/"
                + realm
                + "/protocol/openid-connect/token";

        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();

        formData.add("grant_type", "password");
        formData.add("client_id", clientId);
        formData.add("client_secret", clientSecret);
        formData.add("username", request.getEmail());
        formData.add("password", request.getPassword());
        formData.add("scope", "openid");

        return restClient.post()
                .uri(tokenUrl)
                .contentType(
                        org.springframework.http.MediaType
                                .APPLICATION_FORM_URLENCODED
                )
                .body(formData)
                .retrieve()
                .body(Map.class);


    }

    @Override
    public String createUser(User user, Role role) {
        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setEmail(user.getEmail());
        userRepresentation.setFirstName(user.getFirstName());
        userRepresentation.setLastName(user.getLastName());
        userRepresentation.setUsername(user.getEmail());
        userRepresentation.setEmailVerified(false);
        userRepresentation.setEnabled(true);

        CredentialRepresentation credential = new CredentialRepresentation();
        credential.setType(CredentialRepresentation.PASSWORD);
        credential.setValue(user.getPasswordHash());
        credential.setTemporary(false);

        userRepresentation.setCredentials(List.of(credential));

        Response response = keycloak
                .realm(realm)
                .users()
                .create(userRepresentation);

        if (response.getStatus() != 201) {
            String error = response.hasEntity() ? response.readEntity(String.class) : "Unknown Keycloak error";
            response.close();
            throw new RuntimeException(
                    "Failed to create Keycloak user: " + error
            );
        }

        String userId = extractUserId(response);
        response.close();

        RoleRepresentation keycloakRole = keycloak
                .realm(realm)
                .roles()
                .get(role.toString())
                .toRepresentation();

        keycloak
                .realm(realm)
                .users()
                .get(userId)
                .roles()
                .realmLevel()
                .add(List.of(keycloakRole));

        return userId;
    }

    private String extractUserId(Response response) {

        String location = response
                .getLocation()
                .toString();

        return location.substring(
                location.lastIndexOf("/") + 1
        );
    }
}
