package com.cbj.guliMall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.cbj.guliMall.product.dao")
@SpringBootApplication
public class GuliMallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuliMallProductApplication.class, args);
	}

}
