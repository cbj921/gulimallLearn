package com.cbj.guliMall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GuliMallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuliMallWareApplication.class, args);
	}

}
