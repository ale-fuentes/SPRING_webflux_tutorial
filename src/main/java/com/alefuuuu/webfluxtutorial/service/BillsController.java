package com.alefuuuu.webfluxtutorial.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alefuuuu.webfluxtutorial.domain.Bill;

@RestController
public class BillsController {
	
	@GetMapping("/bill")
	public List<Bill> bills(){
		List<Bill> list = new ArrayList<Bill>();
		list.add(new Bill(1, "computer", 200.50));
		list.add(new Bill(2, "tablet", 150.55));
		
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
