package com.erj.practice.helloworld.channel;

public class MyHelloService implements HelloService{
	public void greet(String name){
		System.out.println("Hello, " + name);
	}
}
