package com.example.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	// private final Logger LOG = Logger.getLogger(this.getClass());
	private final org.slf4j.Logger LOG = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/")
	public String root() {
		
		LOG.info("log test");
		
		return "Hello, Spring Boot";
	}
	
}

