package com.bengonohugues.ereuka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EreukaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EreukaApplication.class, args);
	}

}
