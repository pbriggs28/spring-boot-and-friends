package com.prestonb.myproject.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prestonb.myproject.persist.entity.User;


public interface UserRepo extends JpaRepository<User, Long> {

}
