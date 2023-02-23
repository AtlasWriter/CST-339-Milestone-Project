package com.gcu.products;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.ProductModel;

public class DisneyProducts implements Product{

	ArrayList<ProductModel>  item;

	@Override
	public List<ProductModel> getProducts() {
		// TODO Auto-generated method stub
		List<ProductModel> disneyProduct = new ArrayList<ProductModel>();
		
		disneyProduct.add( new ProductModel("Baby Moana", "Moana holding a sea shell", 12, 1.62, 7221));
		disneyProduct.add( new ProductModel("Woodys Boot", "Toy Stoy his boot with Andy written on it", 33, 1.92, 221));
		disneyProduct.add( new ProductModel("Buzz Light Year", "Toy Stoy Buzz foot with Andy written on it", 21, 1.99, 71));
		disneyProduct.add( new ProductModel("Marybell", "Encanto figue with flowers", 33, 2.62, 2451));

		return disneyProduct;
	}

	@Override
	public void addProduct(ProductModel newProduct) {
		this.item.add(newProduct);
		
	}

}
