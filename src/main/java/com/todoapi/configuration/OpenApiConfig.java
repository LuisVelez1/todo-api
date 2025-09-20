package com.todoapi.configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI toDoApiOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("ToDo API")
                        .description("API REST for task management with Spring Boot and PostgreSQL")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Luis Eduardo Vélez")
                                .email("luiseduardovelez88@gmail.com")
                                .url("https://github.com/LuisVelez1"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")))
                .externalDocs(new ExternalDocumentation()
                        .description("GitHub Repository")
                        .url("https://github.com/LuisVelez1/todo-api"));
    }
}
