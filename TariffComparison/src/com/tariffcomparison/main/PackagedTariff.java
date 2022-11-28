package com.tariffcomparison.main;

import com.tariffcomparison.dto.Product;

public class PackagedTariff implements TariiffCalculator {
	//Packaged tariff calculation
	//Calculation model: 800 € for up to 4000 kWh/year and above 4000 kWh/year additionally 30 cent/kWh.
	//Consumption = 3500 kWh/year => Annual costs = 800 €/year
	@Override
	public Product calculateTariff(int consumption) {
		Product productB = new Product();
		productB.setTarrifName("Packaged tariff");

		int annulaCost = 0;
		if (consumption <= 4000)
			annulaCost = 800;
		else {
			consumption = consumption - 4000;
			annulaCost = ((consumption * 30) / 100)+800;
		}
		productB.setAnnualCost(annulaCost);
		return productB;
	}

	
	
}
