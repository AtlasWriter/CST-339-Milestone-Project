package com.gcu.products;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.ProductModel;

public class TeachingProducts implements Product{

	ArrayList<ProductModel>  item;

	@Override
	public List<ProductModel> getProducts() {
		// TODO Auto-generated method stub
		      List<ProductModel> teaching = new ArrayList<ProductModel>();
		      teaching.add(new ProductModel("Apple Charm", "Support teachers everywhere", 33, 1.22, 8771));
		      return teaching;
	}

	@Override
	public void addProduct(ProductModel newProduct) {
		// TODO Auto-generated method stub
		this.item.add(newProduct);
	}

}
