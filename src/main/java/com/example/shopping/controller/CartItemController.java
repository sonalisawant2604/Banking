package com.example.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartItemController {

	@GetMapping("/demo")
	public String display()
	{
		return "hello";
	}
}
