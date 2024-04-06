package com.Sales.SalesPOS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sales")
public class SalesController {
	@GetMapping("/get")
	public String get()
	{
		return "FlipKart";
	}

}
