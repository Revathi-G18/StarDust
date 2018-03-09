package com.springform.demo.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Cart cart;
	@OneToOne(cascade=CascadeType.ALL)
	private User user;

	@OneToOne(cascade=CascadeType.ALL)
	private BillingAddress billingadd;
	
	@OneToOne(cascade=CascadeType.ALL)
	private ShippingAddress shippingadd;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public BillingAddress getBillingadd() {
		return billingadd;
	}
	public void setBillingadd(BillingAddress billingadd) {
		this.billingadd = billingadd;
	}
	public ShippingAddress getShippingadd() {
		return shippingadd;
	}
	public void setShippingadd(ShippingAddress shippingadd) {
		this.shippingadd = shippingadd;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
	}
