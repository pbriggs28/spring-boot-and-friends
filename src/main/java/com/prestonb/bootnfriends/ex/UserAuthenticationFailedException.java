package com.prestonb.bootnfriends.ex;

import com.prestonb.bootnfriends.domain.UserAuthenticationToken;

public class UserAuthenticationFailedException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private UserAuthenticationToken auth;

	public UserAuthenticationFailedException(UserAuthenticationToken auth) {
		super();
		this.auth = auth;
	}

	@Override
	public String getMessage() {
		return "Invalid username or password: " + auth;
	}
	
	

	
}
