package com.gcu.products;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gcu.model.ProductModel;

@Component
public class DisneyProducts implements Product{

	ArrayList<ProductModel> item;
	List<ProductModel> disneyProduct = new ArrayList<ProductModel>();
	@Override
	public List<ProductModel> getProducts() {
		// TODO Auto-generated method stub
		
		disneyProduct.add( new ProductModel("Baby Moana", "Moana holding a sea shell - Moana is the titular protagonist of Disney's 2016 animated feature film of the same name. Born on the island village of Motunui, Moana is the daughter of Chief Tui and Sina, with an inherited love for the seas and voyaging. ", 12, 1.62, 7221));
		disneyProduct.add( new ProductModel("Woodys Boot", "Toy Stoy his boot with Andy written on it - Sheriff Woody Pride is a fictional, pull-string cowboy doll who appears in the Disney–Pixar Toy Story franchise, In the films, Woody is the main protagonist, alongside Buzz Lightyear. ", 33, 1.92, 221));
		disneyProduct.add( new ProductModel("Buzz Light Year", "Toy Stoy Buzz foot with Andy written on it - Buzz Lightyear is one of the main characters in the Disney/Pixar Toy Story franchise, in which he is mainly voiced by Tim Allen.", 21, 1.99, 71));
		disneyProduct.add( new ProductModel("Marybell", "Encanto figue with flowers - Mirabel Madrigal is a fictional character that appears in Walt Disney Animation Studios' 60th feature film, Encanto (2021).", 33, 2.62, 2451));

		return disneyProduct;
	}


	public void addProduct(ProductModel newProduct) {
		disneyProduct.add(newProduct);
		
	}

}
