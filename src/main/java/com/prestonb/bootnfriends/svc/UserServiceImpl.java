package com.prestonb.bootnfriends.svc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import com.prestonb.bootnfriends.domain.User;

@Component
public class UserServiceImpl implements UserService {
	
	private static final String THE_ONLY_USER_EVER = "prestonb";

	@Override
	public User findUser(String username) {
		if(THE_ONLY_USER_EVER.equals(username))
			return new User(THE_ONLY_USER_EVER);
		
		return null;
	}
	
}