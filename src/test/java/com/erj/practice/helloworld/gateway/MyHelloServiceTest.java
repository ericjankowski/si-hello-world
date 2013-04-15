package com.erj.practice.helloworld.gateway;

import static org.junit.Assert.*;

import org.junit.Test;


public class MyHelloServiceTest {

	@Test
	public void greetReturnsGreetingWithName() {
		HelloService service = new MyHelloService();
		
		String result = service.greet("Number One");
		
		assertEquals("Hello, Number One", result);
	}

}
