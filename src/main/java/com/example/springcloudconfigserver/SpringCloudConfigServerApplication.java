package com.example.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerApplication {

	/*
	 * 11 Set up spring cloud config server from scratch
	 * 
	 * http://localhost:8888/application/default
	 * 
	 * http://localhost:8888/spring-boot-config/default
	 * 
	 * Github Link:
	 * https://github.com/chauhan1212/cloud-config.git
	 * 
	 * 
	 * For Enctyption:
	 * POST call:
	 * localhost:8888/encrypt
	 * 
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}
}
