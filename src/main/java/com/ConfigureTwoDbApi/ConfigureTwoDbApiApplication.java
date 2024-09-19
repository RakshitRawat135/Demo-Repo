package com.ConfigureTwoDbApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ConfigureTwoDbApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConfigureTwoDbApiApplication.class, args);
	}

}
