package com.skyhigh.daycareapi.service.impl;

import com.skyhigh.daycareapi.model.User;
import com.skyhigh.daycareapi.model.constants.Role;
import com.skyhigh.daycareapi.service.KeycloakUserService;
import jakarta.ws.rs.core.Response;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeycloakUserServiceImpl implements KeycloakUserService {

    private final Keycloak keycloak;
    private static final String REALM = "daycare";

    public KeycloakUserServiceImpl(@Value("${spring.security.oauth2.resourceserver-url}") String serverUrl,
                                   @Value("${springdoc.swagger-ui.oauth.keycloak.client-id}") String clientId,
                                   @Value("${springdoc.swagger-ui.oauth.keycloak.client-secret}") String clientSecret) {
        this.keycloak = KeycloakBuilder.builder()
                .serverUrl(serverUrl)
                .realm(REALM)
                .grantType(OAuth2Constants.CLIENT_CREDENTIALS)
                .clientId(clientId)
                .clientSecret(clientSecret)
                .build();
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
                .realm(REALM)
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
                .realm(REALM)
                .roles()
                .get(role.toString())
                .toRepresentation();

        keycloak
                .realm(REALM)
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
