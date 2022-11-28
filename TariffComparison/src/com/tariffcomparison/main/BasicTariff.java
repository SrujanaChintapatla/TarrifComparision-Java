package com.tariffcomparison.main;

import com.tariffcomparison.dto.Product;

public class BasicTariff implements TariiffCalculator {

	//BasicTarric Calculation
	//Calculation model:base costs per month 5 € + consumption costs 22 cent/kWh
	//Consumption = 3500 kWh/year => Annual costs = 830 €/year (5€ * 12 months = 60 € base costs + 3500 kWh/year * 22 cent/kWh = 770 € consumption costs)
	int baseCost = 60;
	@Override
	public Product calculateTariff(int consumption) {
		Product productA = new Product();
		productA.setTarrifName("basic electricity tariff");
		productA.setAnnualCost((consumption*22)/100+baseCost);
		return productA;
	}

}
