package com.springform.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CartItem {
	@Id
	@GeneratedValue
private int id;
//private int quantity;
private double totalPrice;
@ManyToOne
private Cart cart;
@ManyToOne
private Product product;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}


}
