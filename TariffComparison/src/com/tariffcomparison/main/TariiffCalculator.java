package com.tariffcomparison.main;

import com.tariffcomparison.dto.Product;

public interface TariiffCalculator {

	Product calculateTariff(int consumption);

}
