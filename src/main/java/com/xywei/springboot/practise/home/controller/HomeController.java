package com.xywei.springboot.practise.home.controller;

import com.xywei.springboot.Man;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	private Man man;

	@GetMapping("/home")
	public String homePage() {
		return man+"hello, home page!";
	}
}
