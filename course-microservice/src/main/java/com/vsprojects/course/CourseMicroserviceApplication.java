package com.vsprojects.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CourseMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseMicroserviceApplication.class, args);
	}

}
