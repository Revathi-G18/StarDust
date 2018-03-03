package com.springform.demo.Dao;

import com.springform.demo.Model.Customer;
import com.springform.demo.Model.User;

public interface CustomerDAO {
	 void registerCustomer(Customer customer);
	 boolean isEmailValid(String email);
	 boolean isUsernameValid(String username);
	 User getUser(String username);
	
}
