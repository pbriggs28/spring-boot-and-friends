package com.prestonb.bootnfriends.svc;

import com.prestonb.bootnfriends.domain.User;

public interface UserService {

	User findUser(String username);
}
