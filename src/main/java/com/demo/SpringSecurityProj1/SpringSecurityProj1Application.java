package com.demo.SpringSecurityProj1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/wish")
public class SpringSecurityProj1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityProj1Application.class, args);
		
	}
	
	@GetMapping("/getWish")
	public String getWishMessage() {
		return "Hello successfully integrated basic security";
	}

}
