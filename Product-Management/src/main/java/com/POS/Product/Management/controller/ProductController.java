package com.POS.Product.Management.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	@RequestMapping("/get")
	public String getProduct()
	{
		return "Soap";
	}
	@RequestMapping("/getall")
	public List<String> getAllCustomer()
	{
		List<String> ll=new ArrayList<String>();
		ll.add("Himalya");
		ll.add("Fair and Lovely");
		ll.add("Paste");
		return ll;
		
	}
}
