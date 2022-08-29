package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ItemPrice;
import com.example.demo.service.ItemPriceService;

@RestController
public class ItemPriceController {
	
	@Autowired
	private ItemPriceService itemPriceService;
	
	@GetMapping("/item/{item}/quant/{quant}")
	public ItemPrice findByItemAndQuantity(@PathVariable String item, @PathVariable(required=false) Integer quant) {
		return itemPriceService.findByItemAndQuantity(item,quant);
		
	}

}
