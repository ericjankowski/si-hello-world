package com.erj.practice.helloworld.gateway;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldExample {
	@SuppressWarnings("resource")
	public static void main (String [] args){
		String configFile = "com/erj/practice/helloworld/gateway/hello.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		HelloService helloService = context.getBean("helloGateway", HelloService.class);
		System.out.println(helloService.greet("World."));
	}
}
