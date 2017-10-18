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
	
	@PostConstruct
	public void init() {
//		This will get called after all beans are instantiated.
//		All @Autowired variables are available and safe	to access.
	}
	
	@PreDestroy
	public void tearDown() {
//		This will get called when the container is shutting down.
//		Close any connections/IO here.
	}

}
