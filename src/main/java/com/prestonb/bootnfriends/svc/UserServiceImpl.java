package com.prestonb.bootnfriends.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prestonb.bootnfriends.dao.UserDao;
import com.prestonb.bootnfriends.domain.User;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired private UserDao userDao;

	@Override
	public User createUser(User newUser) {
		return userDao.save(newUser);
	}
	
	@Override
	public User findUser(Long id) {
		return userDao.findOne(id);
	}
	
}