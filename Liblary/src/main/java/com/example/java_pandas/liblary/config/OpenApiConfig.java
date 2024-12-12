package com.example.java_pandas.liblary.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "Book Management API",version = "v1",description = "API for book and authors"),
        servers = @Server(url = "http://localhost:8080")
)
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi  customOpenAPI() {
        return GroupedOpenApi.builder()
                .group("springBoot")
                .pathsToMatch("api/**")
                .build();
    }
}
