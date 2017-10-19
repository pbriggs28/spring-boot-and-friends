package com.prestonb.bootnfriends.svc;

import org.springframework.stereotype.Component;

import com.prestonb.bootnfriends.domain.User;
import com.prestonb.bootnfriends.domain.UserAuthenticationToken;
import com.prestonb.bootnfriends.ex.UserAuthenticationFailedException;
import com.prestonb.bootnfriends.ex.UserNotFoundException;

@Component
public class UserServiceImpl implements UserService {

	private static final String THE_ONLY_USER_EVER = "prestonb";
	private static final String AND_HIS_PASSWORD = "CAFEBABE";

	@Override
	public User findUser(String username) {
		if(THE_ONLY_USER_EVER.equals(username))
			return new User(THE_ONLY_USER_EVER, AND_HIS_PASSWORD);
		
		return null;
	}
	@Override
	public User authenticate(UserAuthenticationToken auth) throws UserNotFoundException, UserAuthenticationFailedException {
		if(!THE_ONLY_USER_EVER.equals(auth.getUsername()))
			throw new UserNotFoundException(auth);
			
		if(!AND_HIS_PASSWORD.equals(auth.getPassword()))
			throw new UserAuthenticationFailedException(auth);

		return new User(THE_ONLY_USER_EVER, AND_HIS_PASSWORD);
	}

}
