package com.springform.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springform.demo.Dao.ProductDAO;
import com.springform.demo.Model.Product;

@Transactional
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO productDAO;
		public List<Product> getAllProducts() {
			return productDAO.getAllProducts();
		}
		public boolean addProduct(Product product) {
			return productDAO.addProduct(product);
		}
		public boolean deleteProduct(Product product) {
			return productDAO.deleteProduct(product);
		}
		public boolean updateProduct(Product product) {
			return productDAO.updateProduct(product);
		}
		public Product getProduct(int productId) {
			return productDAO.getProduct(productId);
		}
		public List<Product> getProductsbasedonCatId(int CategoryId) {
			
			return productDAO.getProductsbasedonCatId(CategoryId);
		}
		
}

