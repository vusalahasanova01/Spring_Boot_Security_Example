package com.vusala.spring_boot_security_example.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.httpBasic();
        http.formLogin();

        http.authorizeHttpRequests().antMatchers("/dashboard").authenticated()
                .and()
                .authorizeHttpRequests().antMatchers("/index").permitAll();
    }
}
