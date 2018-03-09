package com.springform.demo.Dao;

import com.springform.demo.Model.Customer;
import com.springform.demo.Model.User;

public interface CustomerDAO {
	 public void registerCustomer(Customer customer);
	 public boolean isEmailValid(String email);
	 public boolean isUsernameValid(String username);
	 public User getUser(String username);
	
}
