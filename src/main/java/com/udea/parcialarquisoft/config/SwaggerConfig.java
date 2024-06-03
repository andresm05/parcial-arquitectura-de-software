package com.udea.parcialarquisoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
    
    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Parcial Arquisoft API")
                        .version("1.0")
                        .description("API para el parcial de Arquitectura de Software")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
