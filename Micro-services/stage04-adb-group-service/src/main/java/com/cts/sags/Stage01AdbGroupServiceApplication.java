package com.cts.sags;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Stage01AdbGroupServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Stage01AdbGroupServiceApplication.class, args);
	}

}
