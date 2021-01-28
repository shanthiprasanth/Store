package com.css.java.dto;

import java.util.Arrays;

import com.css.java.exception.ProductNotFoundException;

public class Stores {
	public Product[] products;

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;

	public Stores() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Stores [products=" + Arrays.toString(products) + "]";
	}

	public Stores(Product[] products) {
		super();
		this.products = products;

	}

	public double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException {
		double billAmount = 0.0;
		Product foundProduct = null;
		for (Product item : this.products) {
			if (item.getProductID() == productCode) {
				foundProduct = item;
				break;
			}
		}
		if (foundProduct != null) {
			if (foundProduct.getQuantityOnHand() >= qtyRequired) {

				foundProduct.setQuantityOnHand(foundProduct.getQuantityOnHand() - qtyRequired);
				billAmount = foundProduct.getPrice() * qtyRequired;
			}
		}

		return billAmount;
	}

	public boolean updateStock(int productCode, int arrivedQty) throws ProductNotFoundException {
		Product foundProduct = null;
		for (Product item : this.products) {
			if (item.getProductID() == productCode) {
				foundProduct = item;
				break;
			}
		}
		if (foundProduct != null) {
			foundProduct.setQuantityOnHand(foundProduct.getQuantityOnHand() + arrivedQty);
		}
		return true;

	}
}
