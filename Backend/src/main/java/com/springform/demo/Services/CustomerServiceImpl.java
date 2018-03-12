package com.springform.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springform.demo.Dao.CustomerDAO;
import com.springform.demo.Model.Customer;
import com.springform.demo.Model.User;
@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO customerDao;
	public void registerCustomer(Customer customer) {
		customerDao.registerCustomer(customer);
		}

	public boolean isEmailValid(String email) {
		return customerDao.isEmailValid(email);
	}

	public boolean isUsernameValid(String username) {
		return customerDao.isUsernameValid(username);
	}

	public User getUser(String username) 
	{
		return customerDao.getUser(username);
	}
}
