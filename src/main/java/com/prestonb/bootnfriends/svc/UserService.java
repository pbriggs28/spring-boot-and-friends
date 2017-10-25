package com.prestonb.bootnfriends.svc;

import com.prestonb.bootnfriends.domain.User;

public interface UserService {

	User createUser(User newUser);

	User findUser(Long id);
}
