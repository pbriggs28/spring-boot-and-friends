package com.prestonb.bootnfriends.contr;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prestonb.bootnfriends.domain.User;
import com.prestonb.bootnfriends.domain.UserAuthenticationToken;
import com.prestonb.bootnfriends.svc.UserService;

	@RestController
	public class UserController {
		
		@Autowired private UserService userService;
	
		@RequestMapping(path = "/auth", method = RequestMethod.POST)
		public User authenticateUser(
				@Valid @RequestBody UserAuthenticationToken auth) {
			
			return userService.authenticate(auth);
		}
		
	}
