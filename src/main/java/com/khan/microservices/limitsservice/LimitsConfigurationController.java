package com.khan.microservices.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

	//HARD CODED VALUE RETRIVE FROM THE POJO
	@GetMapping("/limit")
	public LimitConfiguration retrieveLimitConfigurationFromConfiguration() {
		return new LimitConfiguration(1000,1);
	}
}
