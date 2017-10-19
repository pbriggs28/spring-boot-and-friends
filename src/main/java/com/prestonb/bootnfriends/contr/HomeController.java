package com.prestonb.bootnfriends.contr;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prestonb.bootnfriends.domain.User;
import com.prestonb.bootnfriends.domain.UserAuthenticationToken;
import com.prestonb.bootnfriends.ex.UserAuthenticationFailedException;
import com.prestonb.bootnfriends.ex.UserNotFoundException;
import com.prestonb.bootnfriends.svc.UserService;

	@Controller
	public class HomeController {
		
		@Autowired private UserService userService;
	
//		@RequestMapping(method = RequestMethod.GET)
//		public String redirectToLoginMapping() {
//			return "redirect:/login";
//		}
	
		@RequestMapping(path = "/login", method = RequestMethod.GET)
		public String loginPageGET(ModelMap model) {
			model.addAttribute("user", new UserAuthenticationToken());
			return "login";
		}
		
	
		@RequestMapping(path = "/login", method = RequestMethod.POST)
		public String loginPagePOST(ModelMap model
				, @ModelAttribute("user") @Valid UserAuthenticationToken token
				, BindingResult errors) {
			
			// Check for blank username/password
			if(errors.hasErrors())
				return "login";
			
			// Check for invalid credentials
			User user;
			try {
				user = userService.authenticate(token);
			} catch (UserNotFoundException | UserAuthenticationFailedException e) {
				model.addAttribute("errMsg", "The username and/or password is invalid");
				return "login";
			}
			
			// Successful authentication
			return "redirect:/home";
		}
		
		@RequestMapping("/home")
		public String homePage() {
			return "home";
		}
	}
