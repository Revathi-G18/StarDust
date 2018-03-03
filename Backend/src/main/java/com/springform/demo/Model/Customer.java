package com.springform.demo.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	private int CustomerId;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Phone;

	@OneToOne(cascade=CascadeType.ALL)
	private User user;

	@OneToOne(cascade=CascadeType.ALL)
	private BillingAddress billingadd;

	@OneToOne(cascade=CascadeType.ALL)
	private ShippingAddress shippingadd;
	
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
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
	}
