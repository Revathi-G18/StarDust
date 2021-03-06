package com.springform.demo.Services;


import com.springform.demo.Model.Cart;
import com.springform.demo.Model.CartItem;
import com.springform.demo.Model.CustomerOrder;

public interface CartItemService {
	public void saveOrUpdateCartItem(CartItem cartItem);

	public void removeCartItem(int cartItemId);

	public Cart getCart(int cartId);

	public CustomerOrder createOrder(Cart cart);
}
