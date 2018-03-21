package com.springform.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springform.demo.Dao.CartItemDAO;
import com.springform.demo.Model.Cart;
import com.springform.demo.Model.CartItem;
import com.springform.demo.Model.CustomerOrder;
@Transactional
@Service
public class CartItemServiceImpl implements CartItemService {
	@Autowired
	private CartItemDAO cartitemDAO;
	public void saveOrUpdateCartItem(CartItem cartItem) {
		cartitemDAO.saveOrUpdateCartItem(cartItem);
		
	}

	public void removeCartItem(int cartItemId) {
		cartitemDAO.removeCartItem(cartItemId);
		
	}

	public Cart getCart(int cartId) {
		return cartitemDAO.getCart(cartId);
	}

	public CustomerOrder createOrder(Cart cart) {
		return cartitemDAO.createOrder(cart);
	}

}
