package com.rit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Welcome Home";
	}
	@GetMapping("/page1")
	public String page1() {
		return "Welcome Page1";
	}
	@GetMapping("/page2")
	public String page2() {
		return "Welcome Page2";
	}
	@GetMapping("/page3")
	public String page3() {
		return "Welcome Page3";
	}
}

