package com.intellectdesign.intellectdesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.intellectdesign.controller", "com.intellectdesign.service","com.intellectdesign.dao"})
@EntityScan({"com.intellectdesign.dao"})
public class IntellectDesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntellectDesignApplication.class, args);
	}
}
