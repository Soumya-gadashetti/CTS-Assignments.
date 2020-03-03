package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Stage04AdbConfigService1Application {

	public static void main(String[] args) {
		SpringApplication.run(Stage04AdbConfigService1Application.class, args);
	}

}
