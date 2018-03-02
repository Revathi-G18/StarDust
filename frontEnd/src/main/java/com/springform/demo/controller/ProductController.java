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
import org.springframework.web.servlet.ModelAndView;

import com.springform.demo.Model.Category;
import com.springform.demo.Model.Product;
import com.springform.demo.Services.CategoryService;
import com.springform.demo.Services.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryservice;

		@RequestMapping(value="/all/getallproducts")
	public ModelAndView getAllProducts(){
		List<Product> products=productService.getAllProducts();
		System.out.println(products.get(0).getProductName());
		//productlist - logical view name [productlist.jsp]
		//products - model attribute [use this attribute in jsp]
		//products - List<Product> data 
		return new ModelAndView("productlist","productsAttr",products);
		//JSTL and EL 
	}  @RequestMapping("/addpro")
	public String addProducts(@RequestParam("proname") String proname, @RequestParam("prodesc") String prodesc,  @RequestParam("procost") int procost,@RequestParam("stock") int stock,@RequestParam("categoryId") int catid,ModelMap model) {
		Product product=new Product();
		product.setProductName(proname);
		product.setProductDesc(prodesc);
		product.setPrice(procost);
		product.setPrice(stock);
		
		product.setCategory(categoryservice.getCategory(catid));
		
		productService.addProduct(product);		
		List<Product> listProducts = productService.getAllProducts();
		List<Category> listCategories=categoryservice.getCategories();
		model.addAttribute("listCategories", listCategories);
		model.addAttribute("listProducts", listProducts);
		return "addpro";			
	}

	@RequestMapping("/add")
	public String showProduct(Model m) {
		List<Product> listProducts = productService.getAllProducts();
		
		List<Category> listCategories=categoryservice.getCategories();
		m.addAttribute("listCategories", listCategories);
		m.addAttribute("listProducts", listProducts);
		return "addpro";
	}
	@RequestMapping(value="/UpdateProduct",method=RequestMethod.POST)
	public String updateProductInDB(@RequestParam("proid") int productId,@RequestParam("proname") String proname,@RequestParam("prodesc") String prodesc,@RequestParam("procost") int procost,@RequestParam("stock") int stock,Model m)
	{
		Product product=productService.getProduct(productId);
		product.setProductName(proname);
		product.setProductDesc(prodesc);
		product.setPrice(procost);
		product.setStock(stock);
		
		productService.updateProduct(product);
		List<Product> listProducts=productService.getAllProducts();
		m.addAttribute("listProducts",listProducts);
		return "addpro";
	}
	
	@RequestMapping("/updateProduct/{productId}")
	public String updateProduct(@PathVariable("productId") int productId,Model m)
	{
		Product product=productService.getProduct(productId);		
		List<Product> listProducts=productService.getAllProducts();
		System.out.println("in product controller-------------");
		System.out.println(product.getProductName());
		System.out.println(listProducts.get(0).getProductDesc());
		m.addAttribute("listProducts",listProducts);
		m.addAttribute("productInfo",product);
		return "UpdateProduct";
	}
	
	@RequestMapping("/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable("productId") int productId,Model m)
	{	Product product=productService.getProduct(productId);		
		productService.deleteProduct(product);		
		List<Product> listProducts=productService.getAllProducts();
		m.addAttribute("listProducts",listProducts);
		return "addpro";
	}
}