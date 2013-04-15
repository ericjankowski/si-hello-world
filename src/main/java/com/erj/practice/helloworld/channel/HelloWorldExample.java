package com.erj.practice.helloworld.channel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

public class HelloWorldExample {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		String configFile = "com/erj/practice/helloworld/channel/hello.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		MessageChannel channel = context.getBean("names", MessageChannel.class);
		Message<String> message = MessageBuilder.withPayload("Github").build();
		channel.send(message);
	}
}
