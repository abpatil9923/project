package com.product.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.product.dto.Product;
import com.product.dto.Seller;


@Service
public interface SellerService {

	public int updateProduct(String productCategory, String productType, String productname, Long sellerId); 

	public void deleteProductById(Long sellerId);
	
	public List<Product> getProductBySellerId(Long sellerId);

	public void addSellerWithProducts(Seller seller);
}
