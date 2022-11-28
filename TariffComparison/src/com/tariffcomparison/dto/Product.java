package com.tariffcomparison.dto;

import java.util.Comparator;

public class Product implements Comparator<Product>{

	//Product with two columns tarrifName,annualCost

	private String tarrifName;
	
	private int annualCost;

	public String getTarrifName() {
		return tarrifName;
	}

	public void setTarrifName(String tarrifName) {
		this.tarrifName = tarrifName;
	}

	public int getAnnualCost() {
		return annualCost;
	}

	public void setAnnualCost(int annualCost) {
		this.annualCost = annualCost;
	}

	@Override
	public String toString() {
		return "Product [tarrifName=" + tarrifName + ", annualCost=" + annualCost + "]";
	}

	@Override
	public int compare(Product p1, Product p2) {
		return p1.annualCost -p2.annualCost; 
	}
	
	
}
