package com.vellasques.apiclientes.application.config;

import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

public class Beans {
    @Bean
    Logger logger() {
        return Logger.getLogger("apiclientes");
    }
}
