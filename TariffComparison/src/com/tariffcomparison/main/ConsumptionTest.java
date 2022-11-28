package com.tariffcomparison.main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.tariffcomparison.dto.Product;

class ConsumptionTest {

	@Test
	void CalculateTariff_test() {
		List<Product> list = new Consumption().CalculateTariff(4500);
	assertNotNull(list);
	assertEquals(950, list.get(0).getAnnualCost());
	assertEquals(1050, list.get(1).getAnnualCost());
	}

	
	@Test
	void CalculateTariff_test_1() {
		List<Product> list = new Consumption().CalculateTariff(6000);
	assertNotNull(list);
	assertEquals(1380, list.get(0).getAnnualCost());
	assertEquals(1400, list.get(1).getAnnualCost());
	}
	
	@Test
	void CalculateTariff_test_2() {
		List<Product> list = new Consumption().CalculateTariff(3500);
	assertNotNull(list);
	assertEquals(800, list.get(0).getAnnualCost());
	assertEquals(830, list.get(1).getAnnualCost());
	}
	
	@Test
	void CalculateTariff_test_3() {
		List<Product> list = new Consumption().CalculateTariff(0);
		System.out.println("Test 2 : "+list);
	assertNotNull(list);
	assertEquals(60, list.get(0).getAnnualCost());
	assertEquals(800, list.get(1).getAnnualCost());
	}
}
