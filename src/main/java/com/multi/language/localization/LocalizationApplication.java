package com.multi.language.localization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LocalizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalizationApplication.class, args);
	}

}
