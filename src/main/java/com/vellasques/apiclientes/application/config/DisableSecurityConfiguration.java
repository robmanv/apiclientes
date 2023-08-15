//package com.vellasques.apiclientes.application.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//@Configuration
//public class DisableSecurityConfiguration {
//
//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//        return (web) -> web.ignoring()
//                .requestMatchers("/**");
//    }
//}