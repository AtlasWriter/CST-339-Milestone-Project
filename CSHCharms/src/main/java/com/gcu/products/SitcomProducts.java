package com.gcu.products;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.ProductModel;

public class SitcomProducts implements Product {

	ArrayList<ProductModel>  item;
	@Override
	public List<ProductModel> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProduct(ProductModel newProduct) {
		// TODO Auto-generated method stub
		this.item.add(newProduct);
	}

}
