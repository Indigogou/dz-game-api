package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {


//test
	@GetMapping("/")
	public String home() {
		return "Spring is here!";
	}

	@GetMapping("/page")
	public String page() {
		return "page is here!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
