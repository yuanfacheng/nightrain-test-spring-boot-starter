package com.yuan.test;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaServer
public class NightRainApplication {
	public static void main(String[] args) {
		//https://www.bookstack.cn/read/spring-cloud-docs/README.md
		SpringApplication.run(NightRainApplication.class, args);
		System.out.println("1111111");
	}
}
