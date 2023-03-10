package com.Java_Advance_Day5;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello,%s!";

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting getGreeting() {
		Greeting greeting = new Greeting(1, "hello");
		return greeting;

	}

}
