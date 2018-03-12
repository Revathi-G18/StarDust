package com.springform.demo.Dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springform.demo.Model.Cart;
import com.springform.demo.Model.CartItem;
import com.springform.demo.Model.Customer;
import com.springform.demo.Model.CustomerOrder;
@Repository
@Transactional
public class CartItemDAOImpl implements CartItemDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public void saveOrUpdateCartItem(CartItem cartItem) {
		Session session=sessionFactory.getCurrentSession();
		session.update(cartItem);
		

	}
	@Transactional
	public void removeCartItem(int cartItemId) {
		Session session=sessionFactory.getCurrentSession();
	    //select * from cartitem where id=?
	    CartItem cartItem=(CartItem)session.get(CartItem.class, cartItemId);
	    //delete from cartitem where id=?
	    session.delete(cartItem);
		
	}
	@Transactional
	public Cart getCart(int cartId) {
		Session session=sessionFactory.getCurrentSession();
		Cart cart=(Cart)session.get(Cart.class, cartId);
		//select records both from parent and child table , fetchType.EAGER
		return cart;
	}
	@Transactional
	public CustomerOrder createOrder(Cart cart) {
		Session session=sessionFactory.getCurrentSession();
		CustomerOrder customerOrder=new CustomerOrder();
		customerOrder.setPurchaseDate(new Date());
		List<CartItem> cartItems=cart.getCartItems();
		double grandTotal=0;
		for(CartItem cartItem:cartItems){
			grandTotal=cartItem.getTotalPrice() + grandTotal;
		}
		
		cart.setGrandTotal(grandTotal);//update grandtotal column in cart
		customerOrder.setCart(cart);//FK cart_id
		Customer customer=cart.getCustomer();
		customerOrder.setCustomer(customer);//FK customer_id
		customerOrder.setBillingAdd(customer.getBillingadd());//FK billingaddress_id
		customerOrder.setShippingAdd(customer.getShippingadd());//FK shipping Address Id
		session.save(customerOrder);
		//insert into customerorder ..
		//update cart set grandtotal where id=?
		//update shippingaddress set ..... where id=?
		return customerOrder;
	}

}