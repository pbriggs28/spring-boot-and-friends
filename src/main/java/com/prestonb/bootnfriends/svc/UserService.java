package com.prestonb.bootnfriends.svc;

import com.prestonb.bootnfriends.domain.User;
import com.prestonb.bootnfriends.domain.UserAuthenticationToken;
import com.prestonb.bootnfriends.ex.UserAuthenticationFailedException;
import com.prestonb.bootnfriends.ex.UserNotFoundException;

public interface UserService {

	User findUser(String username);

	User authenticate(UserAuthenticationToken auth) throws UserNotFoundException, UserAuthenticationFailedException;
}
