package com.springform.demo.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CustomerOrder {
	@Id
	@GeneratedValue
private int orderId;
private Date purchaseDate;
@ManyToOne(cascade=CascadeType.ALL)
private Cart cart;
@ManyToOne(cascade=CascadeType.ALL)
private Customer customer;
@ManyToOne(cascade=CascadeType.ALL)
private BillingAddress billingAdd;
@ManyToOne(cascade=CascadeType.ALL)
private ShippingAddress shippingAdd;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public Date getPurchaseDate() {
	return purchaseDate;
}
public void setPurchaseDate(Date purchaseDate) {
	this.purchaseDate = purchaseDate;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public BillingAddress getBillingAdd() {
	return billingAdd;
}
public void setBillingAdd(BillingAddress billingAdd) {
	this.billingAdd = billingAdd;
}
public ShippingAddress getShippingAdd() {
	return shippingAdd;
}
public void setShippingAdd(ShippingAddress shippingAdd) {
	this.shippingAdd = shippingAdd;
}


}
