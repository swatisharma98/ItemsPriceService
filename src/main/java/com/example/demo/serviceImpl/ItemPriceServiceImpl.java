package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.ItemPrice;
import com.example.demo.service.ItemPriceService;


@Service
public class ItemPriceServiceImpl implements ItemPriceService{

	@Autowired
	private Environment environment;

	@Override
	public ItemPrice findByItemAndQuantity(String item, Integer quant) {
		ItemPrice obj = new ItemPrice();

		String port = environment.getProperty("local.server.port");
		if(item.equals("Apple")) {
			obj.setItem(item);
			obj.setQuantity(quant == null ? 1 : quant);
			obj.setPrice(15 * obj.getQuantity());
			
		}else if(item.equals("Papaya")) {
			obj.setItem(item);
			obj.setQuantity(quant == null ? 0 : quant);
			obj.setPrice(60 * obj.getQuantity());
			
		}else if(item.equals("Banana")) {
			obj.setItem(item);
			obj.setQuantity(quant == null ? 0 : quant);
			obj.setPrice(5 * obj.getQuantity());
			
		}else {
			obj.setItem(item);
			obj.setQuantity(quant == null ? 0 : quant);
			obj.setPrice(0);
			obj.setMessage("NO item found");
		}
		obj.setPort(port);
		return obj;
	}

}
