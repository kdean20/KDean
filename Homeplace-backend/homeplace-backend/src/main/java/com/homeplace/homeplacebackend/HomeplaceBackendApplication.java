package com.homeplace.homeplacebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.homeplace")
public class HomeplaceBackendApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder
	configure(SpringApplicationBuilder application) {
		return application.sources(HomeplaceBackendApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HomeplaceBackendApplication.class, args);
	}

}
