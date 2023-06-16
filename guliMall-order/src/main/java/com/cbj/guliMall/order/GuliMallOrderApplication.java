package com.cbj.guliMall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GuliMallOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuliMallOrderApplication.class, args);
	}

}
