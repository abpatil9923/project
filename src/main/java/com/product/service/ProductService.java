package com.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product.dto.Product;

@Service
public interface ProductService {
	
	public List<Product> getProducts();
	
	public void addProduct(Product product);
	
	public List<Product> getProductByProductName(String productName);
	
	public List<Product> getProductByProductType(String productType);

	public List<Product> getProductByProductCategory(String productCategory);


}
