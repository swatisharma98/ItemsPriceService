package com.example.demo.service;

import com.example.demo.model.ItemPrice;

public interface ItemPriceService {

	ItemPrice findByItemAndQuantity(String item, Integer quant);

}
