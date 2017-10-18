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
			User user1 = userService.findUser("prestonb");
			System.out.println(user1);
		}
	}
