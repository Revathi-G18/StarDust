package com.springform.demo.Services;

import com.springform.demo.Model.Customer;
import com.springform.demo.Model.User;

public interface CustomerService {
	 public void registerCustomer(Customer customer);
	 public boolean isEmailValid(String email);
	 public boolean isUsernameValid(String username);
	 public User getUser(String username);
}
