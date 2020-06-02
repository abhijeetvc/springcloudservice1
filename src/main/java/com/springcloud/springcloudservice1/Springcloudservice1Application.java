package com.springcloud.springcloudservice1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Microservice1
@RestController
@SpringBootApplication
public class Springcloudservice1Application {

	public static void main(String[] args) {

		SpringApplication.run(Springcloudservice1Application.class, args);

	}

	@Value("${message1:Hello default}")
	private String message;

	@RequestMapping("/message")
	String getMessage() {
		return this.message;
	}
}
