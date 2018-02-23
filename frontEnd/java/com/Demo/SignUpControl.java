package com.Demo;
/*package com.Demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Demo.dao.AdminDAO;
import com.Demo.dao.AdminDAOImpl;
import com.Demo.dao.CategoryDAO;
import com.Demo.dao.SignUpDAO;
import com.Demo.model.SignUp;
@ComponentScan("com.Demo")
@Controller
public class SignUpControl {
	
	@Autowired
	private SignUpDAO signUpDAO;
	
	@Autowired
	private AdminDAO adminDAO;
	
	@RequestMapping("/signup")
	public String signup(){
		
		return "Signup";
	}
	@RequestMapping("/printtt")
	
	public String Print(){
		adminDAO.Print();
		return "Category";
	}
	@RequestMapping("/SignUp")
	public ModelAndView Signup(Model model,SignUp signup){
		model.addAttribute("signup", signup);
		signUpDAO.create(signup);
		return new ModelAndView ("Category");
	}
}
*/