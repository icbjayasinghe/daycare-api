package com.skyhigh.daycareapi.config.swagger;

import io.swagger.v3.oas.models.security.OAuthFlow;
import io.swagger.v3.oas.models.security.OAuthFlows;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Swagger Daycare")
                                .description("This is a daycare server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). ")
                                .termsOfService("http://swagger.io/terms/")
                                .contact(
                                        new Contact()
                                                .email("apiteam@swagger.io")
                                )
                                .license(
                                        new License()
                                                .name("Apache 2.0")
                                                .url("http://www.apache.org/licenses/LICENSE-2.0.html")
                                )
                                .version("1.0.0")
                )
                .addSecurityItem(
                        new SecurityRequirement()
                                .addList("keycloak")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("keycloak",
                                        new SecurityScheme()
                                                .type(SecurityScheme.Type.OAUTH2)
                                                .flows(new OAuthFlows()
                                                        .authorizationCode(
                                                                new OAuthFlow()
                                                                        .authorizationUrl("http://localhost:8080/realms/daycare/protocol/openid-connect/auth")
                                                                        .tokenUrl("http://localhost:8080/realms/daycare/protocol/openid-connect/token")
                                                        )))
//                                .addSecuritySchemes("api_key", new SecurityScheme()
//                                        .type(SecurityScheme.Type.APIKEY)
//                                        .in(SecurityScheme.In.HEADER)
//                                        .name("api_key")
//                                )
//                                .addSecuritySchemes("daycare_auth", new SecurityScheme()
//                                        .type(SecurityScheme.Type.OAUTH2)
//                                )
                )
        ;
    }
}