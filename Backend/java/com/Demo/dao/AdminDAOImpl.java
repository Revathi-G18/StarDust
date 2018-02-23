package com.Demo.dao;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.Demo.model.Admin;
import com.Demo.model.Product;
@Repository(value="adminDAO")
@Transactional
@Component
@EnableTransactionManagement
public class AdminDAOImpl implements AdminDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addProduct(Admin admin) {
		try
		{
		sessionFactory.getCurrentSession().save(admin);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}
	}
	public void Print(){
		System.out.println("Dao is triggered");
	
	}
	public boolean deleteProduct(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateProduct(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	public Product getProduct(int adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
