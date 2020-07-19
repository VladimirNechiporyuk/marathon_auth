package com.flamelab.marathon_auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
@EnableEurekaClient
@SpringBootApplication
public class MarathonAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarathonAuthApplication.class, args);
	}

}
