package com.edmart.inventoryservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("inventory-service")
                .packagesToScan("com.edmart.inventoryservice.controller")
                .build();
    }

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Inventory Service")
                        .description("Inventory API")
                        .contact(contact())
                        .version("1.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }

    public Contact contact(){
        return new Contact()
                .name("Developers: Nestor Martourez")
                .url("inventory-service.edmart.com")
                .email("mail.astraopencollab@gmail.com");
    }
}
