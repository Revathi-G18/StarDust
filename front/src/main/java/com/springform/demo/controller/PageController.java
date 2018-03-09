
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
		return "Home";
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
	@RequestMapping(value="/Login")
	public String Login(){
		return "Login";
	}
	@RequestMapping("/tshirt")
	public String tshirts() {
	return "T-Shirt";
    }
	@RequestMapping("/mobile covers")
	public String covers() {
		return "Mobile_Covers";
	}
	@RequestMapping("/Mugs")
	public String mugs() {
		return "Mugs";
	}
	@RequestMapping("/posters")
	public String posters() {
		return "Posters";
	}
	@RequestMapping("/backpacks")
	public String backpacks() {
		return "BackPacks";
	}
	@RequestMapping("/coasters")
	public String coasters() {
		return "Coaster";
	}
}
