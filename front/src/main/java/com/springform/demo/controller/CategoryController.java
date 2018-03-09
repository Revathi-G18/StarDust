package com.springform.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springform.demo.Model.Category;
import com.springform.demo.Services.CategoryService;
@Controller
public class CategoryController {
	@Autowired
	private CategoryService categoryservice;
	@RequestMapping("/category")
	public String show(Model m){
		List<Category> listcategory = categoryservice.getCategories();
        for (Category cat : listcategory) {
		System.out.println(cat.getCategoryName() + ",");
		}
		m.addAttribute("listCategory", listcategory);
		return "Category";
	}
	 
	
	@RequestMapping("/InsertCategory")
	public String addProducts(@RequestParam("catname") String catname, @RequestParam("catdesc") String catdesc, ModelMap model) {
		Category category=new Category();
		category.setCategoryName(catname);
		category.setCateogryDesc(catdesc);
		categoryservice.addCategory(category);
		List<Category> listcategory = categoryservice.getCategories();
		model.addAttribute("listCategory", listcategory);
		return "Category";			
	}
	
	@RequestMapping(value="/UpdateCategory",method=RequestMethod.POST)
	public String updateCategoryInDB(@RequestParam("catid") int categoryId,@RequestParam("catname") String catname,@RequestParam("catdesc") String catdesc,Model m)
	{
		Category category=categoryservice.getCategory(categoryId);
		category.setCategoryName(catname);
		category.setCateogryDesc(catdesc);
		categoryservice.updateCategory(category);
		List<Category> listCategories=categoryservice.getCategories();
		m.addAttribute("listCategory",listCategories);
		return "Category";
	}
	
	@RequestMapping("/updateCategory/{categoryId}")
	public String updateCategory(@PathVariable("categoryId") int categoryId,Model m)
	{
		Category category=categoryservice.getCategory(categoryId);		
		List<Category> listCategories=categoryservice.getCategories();
		m.addAttribute("listCategory",listCategories);
		m.addAttribute("categoryInfo",category);
		return "UpdateCategory";
	}
	
	@RequestMapping("/deleteCategory/{categoryId}")
	public String deleteCategory(@PathVariable("categoryId") int categoryId,Model m)
	{
		Category category=categoryservice.getCategory(categoryId);		
		categoryservice.deleteCategory(category);		
		List<Category> listCategories=categoryservice.getCategories();
		m.addAttribute("listCategory",listCategories);
		return "Category";
	}
//	@RequestMapping("/category")
//	public String showCategory(Model m) {
//		List<Category> listcategory = categoryservice.getCategories();
//		for (Category cat : listcategory) {
//			System.out.println(cat.getCategoryName() + ",");
//		}
//		m.addAttribute("listcategory", listcategory);
//		return "Category";
//	}
}
