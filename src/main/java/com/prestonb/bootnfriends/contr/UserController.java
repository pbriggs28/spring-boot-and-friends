package com.prestonb.bootnfriends.contr;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prestonb.bootnfriends.domain.User;
import com.prestonb.bootnfriends.domain.UserAuthenticationToken;
import com.prestonb.bootnfriends.ex.UserAuthenticationFailedException;
import com.prestonb.bootnfriends.ex.UserNotFoundException;
import com.prestonb.bootnfriends.svc.UserService;

	@RestController
	public class UserController {
		
		@Autowired private UserService userService;

		/**
		 * Give away everyone's credentials for the cheap.
		 */
		@RequestMapping(path = "/get-user/{username}", method = RequestMethod.GET)
		public ResponseEntity<User> getUser(
				@PathVariable(name = "username", required = true) String username) {
			
			User user = userService.findUser(username);
			if(user == null)
				return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
			
			return ResponseEntity.ok(user);
		}

		/**
		 * Check if you're authenticated and do absolutely nothing with it.
		 * Very useful for developers paid per web request.
		 */
		@RequestMapping(path = "/auth", method = RequestMethod.POST)
		public User authenticateUser(@Valid @RequestBody UserAuthenticationToken auth) 
				throws UserNotFoundException, UserAuthenticationFailedException {
			
			return userService.authenticate(auth);
		}
		
		/**
		 * Intercepts any UserNotFoundException exceptions thrown by this controller.
		 */
		@ExceptionHandler(value = UserNotFoundException.class)
		protected ResponseEntity<String> handleUserNotFoundException(UserNotFoundException e) {

			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
		/**
		 * Intercepts any UserAuthenticationFailedException exceptions thrown by this controller.
		 */
		@ExceptionHandler(value = UserAuthenticationFailedException.class)
		protected ResponseEntity<String> handleUserAuthenticationFailedException(
				UserAuthenticationFailedException e) {

			return new ResponseEntity<String>(e.getMessage(), HttpStatus.UNAUTHORIZED);
		}
		
	}
