package com.springform.demo.Services;

import java.util.List;

import com.springform.demo.Model.Product;
public interface ProductService {
	public boolean addProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean updateProduct(Product product);
	public Product getProduct(int productId);
	List<Product> getAllProducts();
}
