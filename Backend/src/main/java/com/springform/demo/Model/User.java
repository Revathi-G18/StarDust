package com.springform.demo.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	private String username;
	private String userpassword;
	private boolean enabled;
	@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
	private Authority authority;
	@OneToOne(mappedBy="user")
	private Customer customer;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public Authority getAuthority() {
		return authority;
	}
	public void setAuthority(Authority authority) {
		this.authority = authority;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Customer getCustomer() {
		System.out.println("***"+customer.getFirstName());
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	}
