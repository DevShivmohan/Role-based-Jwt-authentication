package com.jwt.security.swagger;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public Docket postsApi(){
        return new Docket(DocumentationType.SWAGGER_2).select().build();
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build()
//                .securitySchemes(Arrays.asList(securityScheme()))
//                .securityContexts(Arrays.asList(securityContext()));
    }

//    private SecurityScheme securityScheme() {
//        GrantType grantType = new AuthorizationCodeGrantBuilder()
//                .tokenEndpoint(new TokenEndpoint(AUTH_SERVER + "/token", "oauthtoken"))
//                .tokenRequestEndpoint(
//                        new TokenRequestEndpoint(AUTH_SERVER + "/authorize", CLIENT_ID, CLIENT_SECRET))
//                .build();
//
//        SecurityScheme oauth = new OAuthBuilder().name("spring_oauth")
//                .grantTypes(Arrays.asList(grantType))
//                .scopes(Arrays.asList(scopes()))
//                .build();
//        return oauth;
//    }
}
