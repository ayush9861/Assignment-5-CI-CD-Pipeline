package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestApiApplication.class);



	}

	private void saveData() {
	}

//@SpringBootApplication
	public static class RestApiApplication {

		public static void main(String[] args) {
			SpringApplication.run(RestApiApplication.class, args);
		}

	}
}
