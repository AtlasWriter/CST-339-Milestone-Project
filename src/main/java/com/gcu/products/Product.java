package com.gcu.products;

import java.util.List;

import com.gcu.model.ProductModel;

public interface Product {
	
	public List<ProductModel> getProducts();
	
	
	public void addProduct(ProductModel newProduct);
	
	
	/*
	 * Future Methods:
	 * 
	 * searchProdcuts(String searchTerm)
	 * 
	 * addProduct(ProductModel new0)
	 * 
	 * deleteProduct(Long itemNumber)
	 * 
	 * updateProduct(ProductModel updateMe)
	 */

}
