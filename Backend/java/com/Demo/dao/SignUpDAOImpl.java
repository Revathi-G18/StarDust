package com.Demo.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Demo.model.SignUp;
@Repository("signUpDAO")
public class SignUpDAOImpl implements SignUpDAO{
	@Autowired
	SessionFactory sessionFactory;
	@Transactional
	public boolean create(SignUp user) {
		try
		{
		sessionFactory.getCurrentSession().save(user);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}
	}

}
