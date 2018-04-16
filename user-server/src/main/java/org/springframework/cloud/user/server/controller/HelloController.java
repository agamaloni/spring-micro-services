package org.springframework.cloud.user.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Created by alonia on 4/16/2018
 * *
 * All rigths reserved to DELL EMC
 */


@RestController
@RequestMapping("/hello/client")
public class HelloController {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "fallback" , groupKey = "Hello" , commandKey = "hello" , threadPoolKey = "helloThread")
	@GetMapping("/sayhello")
	public String hello(){
		String url = "http://payment-servies/payments/pay";
		return restTemplate.getForObject(url, String.class) + "include client";
	}

	public String fallback(Throwable hystrixCommand){
		return "Fall Back Hello World";
	}
}
