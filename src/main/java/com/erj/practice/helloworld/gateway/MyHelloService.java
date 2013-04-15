package com.erj.practice.helloworld.gateway;

public class MyHelloService implements HelloService{
	
	@Override
	public String greet(String name){
		return "Hello, " + name;
	}
}
