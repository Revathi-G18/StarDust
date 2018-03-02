package com.springform.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	@RequestMapping("/Product")
	public String Product() {
		return "Product";
	}
}
/*@Autowired
private CategoryDAO categoryDAO;

@RequestMapping("/print")
	public ModelAndView Print(){
	Category c=new Category();
	c.setCategoryName("Book Cupboard");
	c.setCateogryDesc("All the Book Cupboard Types");
		categoryDAO.addCategory(c);
		return new ModelAndView("Category");
	}
}*/
