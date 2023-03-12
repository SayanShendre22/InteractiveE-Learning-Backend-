package com.interactiveElearning.interactiveElearning.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllers {

	
	@RequestMapping("/hello")
	public String Hello() {
		return "Hello human how are you";
	}
	
	@RequestMapping("/hello2")
	public String Hello2() {
		return "Hello 2 human how are you";
	}

}
