package com.cbj.guliMall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.cbj.guliMall.member.feign")
public class GuliMallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuliMallMemberApplication.class, args);
	}

}
