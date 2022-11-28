package com.tariffcomparison.main;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.tariffcomparison.dto.Product;

public class Consumption { 

	public static void main(String[] args) {
			
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter your consumper in kWh/year- ");  
		int consumption= sc.nextInt();  
		
		System.out.println(CalculateTariff(consumption));
		
		
	}

	 static List<Product> CalculateTariff(int consumption) {
		List<Product> products = new TariffFactory().getTariff(consumption);
		Collections.sort(products,new Product());
		return products;
	}
	


}
