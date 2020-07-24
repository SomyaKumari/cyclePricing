/*package com.cycle.serviceImpl;

import com.cycle.model.Price;
import org.springframework.beans.factory.annotation.Autowired;

import com.cycle.model.Bicycle;
import com.cycle.repository.BicycleRepository;
import com.cycle.service.BicycleService;

public class BicycleServiceImpl implements BicycleService {
	
	@Autowired
BicycleRepository bicycleRepositor;
	public Bicycle getBicyclePrice(Integer bicycleId, double price) {
		//Bicycle cycle =  bicycleRepositor.findById(bicycleId).get();
		Price price1 = Price.builder().price(4000.0).build();
		Bicycle cycle = Bicycle.builder().brandName("Altas").modelName("acx").price(price1).build();
		return bicycleRepositor.save(cycle);
	}
}*/
