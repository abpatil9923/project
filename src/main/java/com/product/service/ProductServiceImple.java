package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dto.Price;
import com.product.dto.Product;
import com.product.repo.ProductRepository;

@Service
public class ProductServiceImple implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public void addProduct(Product product) {

		productRepository.save(product);
	}

	@Override
	public List<Product> getProductByProductName(String productName) {
		
		return productRepository.findByProductName(productName);
	}

	@Override
	public List<Product> getProductByProductType(String productType) {

		return productRepository.findByProductType(productType);
	}

	@Override
	public List<Product> getProductByProductCategory(String productCategory) {

		return productRepository.findByProductCategory(productCategory);
	}

	@Override
	public List<Product> getProducts() {
		
		return productRepository.findAll();
	}

}
