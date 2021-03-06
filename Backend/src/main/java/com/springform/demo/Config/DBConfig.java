package com.springform.demo.Config;

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

import com.springform.demo.Model.Authority;
import com.springform.demo.Model.BillingAddress;
import com.springform.demo.Model.Cart;
import com.springform.demo.Model.CartItem;
import com.springform.demo.Model.Category;
import com.springform.demo.Model.Customer;
import com.springform.demo.Model.CustomerOrder;
import com.springform.demo.Model.Product;
import com.springform.demo.Model.ShippingAddress;
import com.springform.demo.Model.User;

@Configuration
@ComponentScan("com.springform.demo")
@EnableTransactionManagement

public class DBConfig {
	@Bean(name="dataSource")
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
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
		factoryBuilder.addAnnotatedClass(User.class);
		factoryBuilder.addAnnotatedClass(Customer.class);
		factoryBuilder.addAnnotatedClass(Authority.class);
		factoryBuilder.addAnnotatedClass(BillingAddress.class);
		factoryBuilder.addAnnotatedClass(ShippingAddress.class);
		factoryBuilder.addAnnotatedClass(Cart.class);
		factoryBuilder.addAnnotatedClass(CartItem.class);
		factoryBuilder.addAnnotatedClass(CustomerOrder.class);
		factoryBuilder.addProperties(hibernateProp);
		return factoryBuilder.buildSessionFactory();
	}	
	
	@Bean(name="txManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		return new HibernateTransactionManager(sessionFactory);
	}
}
