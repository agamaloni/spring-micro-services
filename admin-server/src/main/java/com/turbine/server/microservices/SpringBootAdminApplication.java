package com.turbine.server.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * Created by alonia on 4/16/2018
 * *
 * All rigths reserved to DELL EMC
 */

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminApplication.class, args);

	}

}
