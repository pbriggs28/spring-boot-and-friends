package com.prestonb.bootnfriends;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.prestonb.bootnfriends.domain.User;
import com.prestonb.bootnfriends.svc.UserService;

	@Component
	public class AppRunner implements ApplicationRunner {
		
		@Autowired private UserService userService;
	
		@Override
		public void run(ApplicationArguments args) throws Exception {
			
			User user1 = new User("prestonb");
			System.out.println("Created user: \t" + user1);
			
			User updatedUser = userService.createUser(user1);
			System.out.println("Saved user: \t" + updatedUser);
			
			User sameUser = userService.findUser(updatedUser.getId());
			
			System.out.println("Found user: \t" + sameUser);
		}
	}
