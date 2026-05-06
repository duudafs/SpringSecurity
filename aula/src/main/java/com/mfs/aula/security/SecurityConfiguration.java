package com.mfs.aula.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.annotation.web.configurers.SessionManagementConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity){
        return httpSecurity
                .csrf(CsrfConfigurer<HttpSecurity> csrf -> csrf.disable());
        .sessionManagement(SessionManagementConfigurer<HttpSecurity> session ->
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }
}
