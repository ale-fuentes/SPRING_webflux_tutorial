package com.alefuuuu.webfluxtutorial.service;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alefuuuu.webfluxtutorial.domain.Bill;

import reactor.core.publisher.Flux;

@RestController
public class BillsController {
	
	@GetMapping("/bill")
	public Flux<Bill> bills(){
		Flux<Bill> list = Flux
				.just(
						new Bill(1, "computer", 200.50),
						new Bill(2, "tablet", 150.55))
				.delaySequence(Duration.ofSeconds(3));
		
		return list;
	}

}
