package com.Demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Demo.dao.AdminDAO;
import com.Demo.dao.CategoryDAO;
import com.Demo.model.Category;

@Controller

public class SampleController {
@Autowired
private CategoryDAO categoryDAO;

@RequestMapping("/print")
	public ModelAndView Print(){
	Category c=new Category();
	c.setCategoryName("Book Cupboard");
	c.setCateogryDesc("All the Book Cupboard Types");
		categoryDAO.addCategory(c);
		return new ModelAndView("Category");
	}
}
