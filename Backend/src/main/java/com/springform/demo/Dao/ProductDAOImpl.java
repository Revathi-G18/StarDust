package com.springform.demo.Dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springform.demo.Model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;
		public List<Product> getAllProducts() {
			//System.out.println("inside productdao");
			Session session=sessionFactory.getCurrentSession();
			//HQL - Hibernate query Language
			Query query=session.createQuery("from Product");//Select * from Product
			System.out.println(query.list());
			return query.list(); //List of Product objects
		}
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
		@Transactional
		public boolean deleteProduct(Product product) {
			try
			{
				sessionFactory.getCurrentSession().delete(product);
				return true;
			}
			catch(Exception e)
			{
				System.out.println("Exception Arised:"+e);
				return false;
			}
		}
		@Transactional
		public boolean updateProduct(Product product) {
			try
			{
				sessionFactory.getCurrentSession().update(product);
				return true;
			}
			catch(Exception e)
			{
				System.out.println("Exception Arised:"+e);
				return false;
			}
		}
		public Product getProduct(int productId) {
			Session session=sessionFactory.openSession();
			Product product=(Product)session.get(Product.class,productId);
			return product;
		}
}
