package com.xywei.springboot.practise.home.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String homePage() {
		return "hello, home page!";
	}
}