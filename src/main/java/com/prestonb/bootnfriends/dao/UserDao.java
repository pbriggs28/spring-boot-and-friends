package com.prestonb.bootnfriends.dao;

import org.springframework.data.repository.CrudRepository;

import com.prestonb.bootnfriends.domain.User;

public interface UserDao extends CrudRepository<User, Long> {

}
