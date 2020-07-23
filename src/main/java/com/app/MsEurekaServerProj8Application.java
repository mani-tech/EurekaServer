package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsEurekaServerProj8Application {

	public static void main(String[] args) {
		SpringApplication.run(MsEurekaServerProj8Application.class, args);
	}

}
