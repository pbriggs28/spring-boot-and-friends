package com.prestonb.bootnfriends.ex;

import com.prestonb.bootnfriends.domain.UserAuthenticationToken;

public class UserNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private UserAuthenticationToken auth;

	public UserNotFoundException(UserAuthenticationToken auth) {
		super();
		this.auth = auth;
	}

	@Override
	public String getMessage() {
		final String username = auth.getUsername() == null ? "null" : auth.getUsername();
		return "Could not find username : " + username;
	}

}
