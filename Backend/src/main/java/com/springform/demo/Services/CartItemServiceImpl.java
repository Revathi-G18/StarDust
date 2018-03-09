package com.springform.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springform.demo.Model.Cart;
import com.springform.demo.Model.CartItem;
import com.springform.demo.Model.CustomerOrder;
@Transactional
@Service
public class CartItemServiceImpl implements CartItemService {
	@Autowired
	private CartItemService cartitemservice;
	public void saveOrUpdateCartItem(CartItem cartItem) {
		cartitemservice.saveOrUpdateCartItem(cartItem);
		
	}

	public void removeCartItem(int cartItemId) {
		cartitemservice.removeCartItem(cartItemId);
		
	}

	public Cart getCart(int cartId) {
		return cartitemservice.getCart(cartId);
	}

	public CustomerOrder createOrder(Cart cart) {
		return cartitemservice.createOrder(cart);
	}

}
