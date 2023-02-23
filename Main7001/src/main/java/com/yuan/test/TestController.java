package com.yuan.test;

import javax.annotation.Resource;

import com.yuan.autoconfig.HelloService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class TestController implements CommandLineRunner {

	/**
	 * 注入自定义starter服务
	 */
	@Resource
	private HelloService helloService;


	@Override
	public void run(String... args) throws Exception {
		System.out.println(helloService.hello());
	}

}