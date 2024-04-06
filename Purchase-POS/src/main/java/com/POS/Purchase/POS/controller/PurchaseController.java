package com.POS.Purchase.POS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {
	@GetMapping("/get")
	public String get()
	{
		return "Lot of products can be purchased";
	}

}
