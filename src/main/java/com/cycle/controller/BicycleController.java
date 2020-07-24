package com.cycle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cycle.service.BicycleService;

@RestController
public class BicycleController {

	@Autowired
	BicycleService bicycleService;
	@GetMapping("/price")
	public void  getBicyclePrice(Double price,@RequestBody Integer bicycleId) {

		bicycleService.getBicyclePrice(bicycleId, price);
	}
}
