package com.aplikacija.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.aplikacija.product.Product;
import com.aplikacija.product.ProductService;

@Controller
public class HomeController {
	 private final ProductService productService;

	    @Autowired
	    public HomeController(ProductService productService) {
	        this.productService = productService;
	    }

	    @GetMapping(value = {"/","/index","/home"})
	    public String home(Model model){
	        model.addAttribute("products", getAllProducts());
	        model.addAttribute("productsCount", productsCount());

	        return "home";
	    }

	    @GetMapping("/about")
	    public String about(){
	        return "about";
	    }

	    private List<Product> getAllProducts(){
	        return productService.findAllByOrderByIdAsc();
	    }

	    private long productsCount(){
	        return productService.count();
	    }
	
}
