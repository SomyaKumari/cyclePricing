package com.cycle.service;

import com.cycle.model.Bicycle;

public interface BicycleService {
	
	public Bicycle getBicyclePrice(Integer bicycleId, double updatedPrice);
}