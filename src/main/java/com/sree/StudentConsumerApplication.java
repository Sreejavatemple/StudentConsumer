package com.sree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentConsumerApplication.class, args);
	}

}
