package com.springform.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Authority {
	@Id
	private int AuthorityId;
	private String Role;
	@OneToOne
	private User user;

	public int getAuthorityId() {
		return AuthorityId;
	}

	public void setAuthorityId(int authorityId) {
		AuthorityId = authorityId;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	}
