package com.prestonb.bootnfriends.contr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	public class HomeController {
	
		@RequestMapping({"/", "/login"})
		public String loginPageGET() {
			return "login";
		}
		
		@RequestMapping("/users")
		public String usersPage() {
			return "users";
		}
	}
