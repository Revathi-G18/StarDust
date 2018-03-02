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
	private ProductDAO productDao;
		public List<Product> getAllProducts() {
			return productDao.getAllProducts();
		}
		public boolean addProduct(Product product) {
			return productDao.addProduct(product);
		}
		public boolean deleteProduct(Product product) {
			return productDao.deleteProduct(product);
		}
		public boolean updateProduct(Product product) {
			return productDao.updateProduct(product);
		}
		public Product getProduct(int productId) {
			return productDao.getProduct(productId);
		}
}
