package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo12Application {
	@GetMapping("welcome")
	public String welcome() {
		return "hello world";
	}


	public static void main(String[] args) {
		SpringApplication.run(Demo12Application.class, args);
		System.out.println("hello world");
	}

}
