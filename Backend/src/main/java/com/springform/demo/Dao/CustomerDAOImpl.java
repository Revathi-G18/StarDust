package com.springform.demo.Dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springform.demo.Model.Authority;
import com.springform.demo.Model.Customer;
import com.springform.demo.Model.User;
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Transactional
	public void registerCustomer(Customer customer) {
		Session session=sessionFactory.getCurrentSession();
		
		Authority authority=new Authority();
		authority.setRole("ROLE_USER");
		authority.setUser(customer.getUser());//FK column in authorities table
		
		customer.getUser().setAuthority(authority);
		customer.getUser().setEnabled(true);
		
		session.save(customer);
		}

	public boolean isEmailValid(String email) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Customer where email=?");
		query.setString(0, email);	
		Customer customer=(Customer)query.uniqueResult();
		if(customer!=null)//duplicate email address, invalid
			return false;
		else
			return true; //if customer = null , unique email address, valid
	}

	public boolean isUsernameValid(String username) {
		Session session=sessionFactory.getCurrentSession();
		User user=(User)session.get(User.class, username);//select * from user where username=?
		if(user!=null)
			return false; //duplicate username, invalid
		else
			return true;//unique username, valid username
	}

	public User getUser(String username) {
		Session session=sessionFactory.getCurrentSession();
		User user=(User)session.get(User.class,username);
		return user;
	}
}
