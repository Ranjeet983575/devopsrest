package com.example.devopsrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DevopsrestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DevopsrestApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(DevopsrestApplication.class);
	}


}
