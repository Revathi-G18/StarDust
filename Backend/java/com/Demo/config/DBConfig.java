package com.Demo.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.Demo.dao.AdminDAOImpl;
import com.Demo.dao.CategoryDAO;
import com.Demo.dao.CategoryDAOImpl;
import com.Demo.dao.ProductDAOImpl;
import com.Demo.dao.SignUpDAOImpl;
import com.Demo.model.Admin;
import com.Demo.model.Category;
import com.Demo.model.Product;
import com.Demo.model.SignUp;
@Configuration
@ComponentScan("com.Demo")
@EnableTransactionManagement
public class DBConfig {
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		
		System.out.println("---Data Source Created---");
		return dataSource;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		
		Properties hibernateProp=new Properties();
		hibernateProp.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProp.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		LocalSessionFactoryBuilder factoryBuilder=new LocalSessionFactoryBuilder(getH2DataSource());
		factoryBuilder.addAnnotatedClass(Category.class);
		factoryBuilder.addAnnotatedClass(Product.class);
		factoryBuilder.addAnnotatedClass(Admin.class);
		factoryBuilder.addAnnotatedClass(SignUp.class);
		//factoryBuilder.addAnnotatedClass(UserDetail.class);
		factoryBuilder.addProperties(hibernateProp);
		System.out.println("Creating SessionFactory Bean");
		return factoryBuilder.buildSessionFactory();
	}	
	@Bean(name="categoryDAO")
	public CategoryDAO getCategoryDAO()
	{
		System.out.println("----DAO Implementation---");
		return new CategoryDAOImpl();
	}
	@Bean(name="productDAO")
	public ProductDAOImpl getProductDAO()
	{
		System.out.println("---Product DAO Implementation ---");
		return new ProductDAOImpl();
	}
	/*@Bean(name="signupDAO")
	public SignUpDAOImpl SignUpDAO()
	{
		System.out.println("---Product DAO Implementation ---");
		return new SignUpDAOImpl();
	}*/
	@Bean(name="adminDAO")
	public AdminDAOImpl getAdminDAO()
	{
		System.out.println("---ADMIN DAO Implementation ---");
		return new AdminDAOImpl();
	}
	@Bean(name="txManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("---Transaction Manager----");
		return new HibernateTransactionManager(sessionFactory);
	}
}
 