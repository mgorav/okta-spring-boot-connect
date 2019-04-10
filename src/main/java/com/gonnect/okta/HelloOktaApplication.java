package com.gonnect.okta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.resource.servlet.OAuth2ResourceServerAutoConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@SpringBootApplication()
public class HelloOktaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloOktaApplication.class, args);
	}
}
