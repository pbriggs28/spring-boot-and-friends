package com.prestonb.bootnfriends.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@SuppressWarnings("unused")


	@Component
	public class UserDaoImpl implements UserDao {
		
		private final DataSource dataSource;
		private final JdbcTemplate jdbcTemplate;
		
		@Autowired
		public UserDaoImpl(DataSource dataSource) {
			this.dataSource = dataSource;
			jdbcTemplate = new JdbcTemplate(dataSource);
		}
	
	}
