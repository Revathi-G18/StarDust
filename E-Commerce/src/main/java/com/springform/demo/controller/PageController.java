
package com.springform.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springform.demo.Model.Category;
import com.springform.demo.Services.CategoryService;


@Controller
public class PageController {
	
	@Autowired
	private CategoryService categoryservice;
	@RequestMapping(value="/Home")
	public String homePage(){
/*		System.out.println("this method is triggered");
		List<Category> listcategory = categoryservice.getCategories();
		System.out.println(listcategory);
		m.addAttribute("categories", listcategory);*/
		return "Home";
	}
	@RequestMapping("/ContactUs")
	public String Contact(){
		return "ContactUs";
	}
	@RequestMapping("/LandingPage")
	public String Page(Model m){
		System.out.println("this method is triggered");
		List<Category> listcategory = categoryservice.getCategories();
		System.out.println(listcategory);
		m.addAttribute("categories", listcategory);
		/*m.addAttribute("categories",categoryservice.getCategories());*/
		return "Home";
	}
	@RequestMapping("/Login")
	public String Login(){
		return "Login";
	}
}
