package com.prestonb.bootnfriends.contr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String helloRest() {
		return "Hello REST!";
	}
}
