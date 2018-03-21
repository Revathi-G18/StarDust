package com.springform.demo.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springform.demo.Model.Cart;
import com.springform.demo.Model.CartItem;
import com.springform.demo.Model.Customer;
import com.springform.demo.Model.CustomerOrder;
import com.springform.demo.Model.Product;
import com.springform.demo.Model.ShippingAddress;
import com.springform.demo.Model.User;
import com.springform.demo.Services.CartItemService;
import com.springform.demo.Services.CustomerService;
import com.springform.demo.Services.ProductService;
@Controller
public class CartItemController {
	@Autowired
	   private CartItemService cartitemService;
	@Autowired
	private CustomerService customerservice;
	@Autowired
	private ProductService productservice;
	org.springframework.security.core.userdetails.User user;
	
	@RequestMapping(value="/cart/addtocart/{id}")
	public String addToCart(@AuthenticationPrincipal Principal principal,@PathVariable int id){
	Product product=productservice.getProduct(id);
	
	
	String username=principal.getName();
	User user=customerservice.getUser(username);
	Customer customer=user.getCustomer();
	Cart cart=customer.getCart();
	CartItem cartItem=new CartItem();
	//cartItem.setQuantity(quantity);
	cartItem.setTotalPrice(product.getPrice());
	cartItem.setCart(cart);
	cartItem.setProduct(product);
	cartitemService.saveOrUpdateCartItem(cartItem);//insert cartitem.
	return "redirect:/cart/getcart";
	
	/*Cart cart=customer.getCart();
	
	List<CartItem> cartItems=cart.getCartItems();
	
	for(CartItem cartItem:cartItems){
		if(cartItem.getProduct().getProductId()==id){
			//cartItem.setQuantity(quantity); //update the quantity
			cartItem.setTotalPrice(product.getPrice()); //update the totalprice
			cartitemService.saveOrUpdateCartItem(cartItem); //update cartitem , quantity and totalprice 
			return "redirect:/cart/getcart";
		}
	}
	
	
	CartItem cartItem=new CartItem();
	//cartItem.setQuantity(quantity);
	cartItem.setTotalPrice(product.getPrice());
	cartItem.setCart(cart);
	cartItem.setProduct(product);
	cartitemService.saveOrUpdateCartItem(cartItem);//insert cartitem.
	return "redirect:/cart/getcart";*/
	
}
	@RequestMapping(value="/cart/getcart")
	public String getCart(@AuthenticationPrincipal Principal principal,Model model){
		String username=principal.getName();
		User user=customerservice.getUser(username);
		Customer customer=user.getCustomer();
		Cart cart=customer.getCart();
		model.addAttribute("cart",cart);
		return "cart";
	}
	@RequestMapping(value="/cart/checkout/{cartId}")
	public String checkout(@PathVariable int cartId,Model model){
		Cart cart=cartitemService.getCart(cartId);
		List<CartItem> cartItems=cart.getCartItems();
		
		Customer customer=cart.getCustomer();
		ShippingAddress shippingAdd=customer.getShippingadd();
		model.addAttribute("shippingaddress",shippingAdd);
		model.addAttribute("cartId",cartId);
		if(cartItems.size()>0) {
		return "shippingAddressForm";
		}else {
			return"redirect:/cart/getcart" ;
			
		}
	}
	
	
	@RequestMapping(value="/cart/createorder/{cartId}")
	//from shippingaddressform.jsp to createOrder method
	public String createOrder(@PathVariable int cartId,@Valid @ModelAttribute ShippingAddress shippingaddress,BindingResult result,
			                  Model model){
		//set the updated shippingaddress for the customer
		//get customer object
		//using cartid , get cart, from cart , get customer,
		//Update shipping address for the customer
		if(result.hasErrors())
			return "shippingAddressForm";
		Cart cart=cartitemService.getCart(cartId);
		Customer customer=cart.getCustomer();
		customer.setShippingadd(shippingaddress);//update shippingaddress set.... where customerid=?
		cart.setCustomer(customer);
		CustomerOrder customerOrder=cartitemService.createOrder(cart);//insert into customerorder
		model.addAttribute("order",customerOrder);
		model.addAttribute("cartId",cartId);
		return "orderdetails";
	}
	
	@RequestMapping(value="/cart/confirm/{cartId}")
	public String confirm(@PathVariable int cartId){
		Cart cart=cartitemService.getCart(cartId);
	
		Product product=new Product();
				List<CartItem> cartItems=cart.getCartItems();
		
		for(CartItem cartItem : cartItems){//for(T v:collection)
			
			//System.out.println(cartItem.getQuantity());
			
			
			cartitemService.removeCartItem(cartItem.getId());//delete from cartitem where id=3
			productservice.getProduct(cartItem.getId());
		}
		return "thanks";
	}
}
