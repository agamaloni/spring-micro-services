package com.turbine.server.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by alonia on 4/16/2018
 * *
 * All rigths reserved to DELL EMC
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
public class TurbineServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(TurbineServerApplication.class, args);

	}

}
