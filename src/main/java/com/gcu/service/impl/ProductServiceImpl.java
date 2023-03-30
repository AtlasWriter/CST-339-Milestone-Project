package com.gcu.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gcu.entity.ProductEntity;
import com.gcu.repository.ProductRepository;
import com.gcu.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public void deleteProductById(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public List<ProductEntity> getAllStudents() {
		return productRepository.findAll();
	}

	@Override
	public ProductEntity getProductById(Long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public ProductEntity saveProduct(ProductEntity student) {
		return productRepository.save(student);
	}

	@Override
	public ProductEntity updateProduct(ProductEntity product) {
		return productRepository.save(product);
	}

}
