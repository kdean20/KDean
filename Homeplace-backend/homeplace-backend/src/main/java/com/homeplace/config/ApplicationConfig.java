package com.homeplace.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages="com.homeplace.repository")
@EntityScan(basePackages="com.homeplace.entity")
public class ApplicationConfig {

}
