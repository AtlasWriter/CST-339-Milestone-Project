package com.gcu.service;

import java.util.List;

import com.gcu.entity.ProductEntity;

public interface ProductService {
	List<ProductEntity> getAllStudents();
	
	ProductEntity saveProduct(ProductEntity product);
	
	ProductEntity getProductById(Long id);
	
	ProductEntity updateProduct(ProductEntity product);
	
	void deleteProductById(Long id);
}
