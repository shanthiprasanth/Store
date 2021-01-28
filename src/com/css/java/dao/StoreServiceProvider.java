package com.css.java.dao;

import com.css.java.exception.ProductNotFoundException;

public interface StoreServiceProvider {
	public double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException;

	public boolean updateStock(int productCode, int arrivedQty) throws ProductNotFoundException;
}
