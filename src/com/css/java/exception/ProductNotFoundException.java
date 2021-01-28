package com.css.java.exception;

public class ProductNotFoundException extends Exception {
	private String errorMsg = "Product Not Found";

	public ProductNotFoundException() {
		super();
	}

	public ProductNotFoundException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public String getMessage() {
		return this.errorMsg;
	}

}