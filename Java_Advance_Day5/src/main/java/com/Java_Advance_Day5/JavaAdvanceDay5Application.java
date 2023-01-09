package com.Java_Advance_Day5;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaAdvanceDay5Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaAdvanceDay5Application.class, args);
//		SpringApplication app=new SpringApplication(JavaAdvanceDay5Application.class);
//        app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
//        app.run(args);
	}
	
	@GetMapping("/Hi")
	public String gethi(@RequestParam String name ) {
		return "Hello "+name;
	}

}
