package com.cts.sags;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Stage01AdbContactService1Application {

	public static void main(String[] args) {
		SpringApplication.run(Stage01AdbContactService1Application.class, args);
	}

}
