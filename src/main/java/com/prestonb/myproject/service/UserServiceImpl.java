package com.prestonb.myproject.service;

import org.springframework.stereotype.Service;

import com.prestonb.myproject.persist.entity.User;
import com.prestonb.myproject.service.dto.UserDto;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, UserDto, Long> implements UserService {


}
