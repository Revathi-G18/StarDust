package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Hiber.Sample.Table;

@Controller
public class FrontController {
	
@RequestMapping("/Login")
public String Login(){
	return "Login";
	}
@RequestMapping("/SignUp")
public String SignUp(){
	return "SignUp";}

@RequestMapping("/Admin")
public String Admin(){
	return "Admin";
}
@RequestMapping("/T-shirt")
public String tshirt(){
	return "T-shirt";
}
}
