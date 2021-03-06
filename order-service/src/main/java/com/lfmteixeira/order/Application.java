package com.lfmteixeira.order;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Order Management",
                version = "1.0",
                description = "Order API"
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }

}
