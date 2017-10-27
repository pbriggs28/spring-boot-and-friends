package com.prestonb.bootnfriends.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.prestonb.bootnfriends.dao.UserDao;
import com.prestonb.bootnfriends.domain.User;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired private UserDao userDao;

	@Override
	@Transactional
	public User createUser(User newUser) {
		return userDao.save(newUser);
	}
	
	@Override
	public User findUser(Long id) {
		return userDao.findOne(id);
	}
	
}