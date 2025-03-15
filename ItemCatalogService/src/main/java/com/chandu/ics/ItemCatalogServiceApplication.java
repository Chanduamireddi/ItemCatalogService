package com.chandu.ics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.chandu.ics")
@ComponentScan(basePackages = "com.chandu.ics")
public class ItemCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemCatalogServiceApplication.class, args);
	}
}

