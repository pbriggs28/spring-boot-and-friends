package com.prestonb.bootnfriends.svc;

import com.prestonb.bootnfriends.domain.User;
import com.prestonb.bootnfriends.domain.UserAuthenticationToken;

public interface UserService {

	User findUser(String username);

	User authenticate(UserAuthenticationToken auth);
}
