package com.prestonb.bootnfriends.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	
	@Column
	private String username;
	
	public User() {
		
	}
	
	public User(String username) {
		this.username = username;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(",\t username=");
		builder.append(username);
		builder.append(",\t hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
}
