package com.Demo.dao;

import java.util.List;

import com.Demo.model.Admin;
import com.Demo.model.Product;

public interface AdminDAO {
	public void Print();
	public boolean addProduct(Admin admin);
	public boolean deleteProduct(Admin admin);
	public boolean updateProduct(Admin admin);
	public Product getProduct(int adminId);
	public List<Product> listProducts();
}
