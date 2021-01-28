package com.css.java.main;

import java.util.Arrays;

import com.css.java.dto.Product;
import com.css.java.dto.Stores;
import com.css.java.exception.ProductNotFoundException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] products = new Product[3];
		products[0] = new Product(123, "Dhall", 120.00, 100, 10, 50);
		products[1] = new Product(124, "Pencil", 20.00, 20, 10, 50);
		products[2] = new Product(125, "Soap", 50.00, 10, 10, 50);
		Stores str = new Stores(products);
		double billValue = 0;
		try {
			billValue = str.sellItem(123, 5);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean arrived = false;
		try {
			arrived = str.updateStock(125, 10);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("BillValue:" + billValue);
		System.out.println("ArrivedQty:" + arrived);
		System.out.println(Arrays.toString(str.getProducts()));
	}

}