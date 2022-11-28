package com.tariffcomparison.main;

import java.util.ArrayList;
import java.util.List;

import com.tariffcomparison.dto.Product;

public class TariffFactory {

	public List<Product> getTariff(int consumption) {
		List<Product>  list = new ArrayList<Product>();
		list.add(new BasicTariff().calculateTariff(consumption));
		list.add(new PackagedTariff().calculateTariff(consumption));
		return list;
	}

	
	

}
