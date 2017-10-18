package com.prestonb.myproject.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prestonb.myproject.persist.entity.Authority;

public interface AuthorityRepo extends JpaRepository<Authority, Long> {

}