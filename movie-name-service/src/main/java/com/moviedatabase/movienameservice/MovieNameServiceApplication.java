package com.moviedatabase.movienameservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieNameServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieNameServiceApplication.class, args);
	}

}
