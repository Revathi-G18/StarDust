package com.springform.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("/tshirt")
	public String tshirts() {
	return "T-Shirt";
    }
	@RequestMapping("/mobile covers")
	public String covers() {
		return "Mobile_Covers";
	}
	@RequestMapping("/mugs")
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
