package com.gcu.service;

import java.util.List;

import com.gcu.entity.ProductEntity;

public interface ProductService {
	void deleteProductById(Long id);
 
	List<ProductEntity> getAllStudents();

	ProductEntity getProductById(Long id);

	ProductEntity saveProduct(ProductEntity product);

	ProductEntity updateProduct(ProductEntity product);
}
