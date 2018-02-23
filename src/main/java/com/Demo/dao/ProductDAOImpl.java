package com.Demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Demo.model.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean addProduct(Product product) {
		try
		{
		sessionFactory.getCurrentSession().save(product);
		return true;
		}
		catch(Exception e)
		{
		System.out.println("Exception Arised:"+e);
		return false;
		}
	}

	public boolean deleteProduct(Product product) {
		return false;
	}

	public boolean updateProduct(Product product) {
		return false;
	}

	public Product getProduct(int productId) {
		return null;
	}

	public List<Product> listProducts() {
		return null;
	}

}
