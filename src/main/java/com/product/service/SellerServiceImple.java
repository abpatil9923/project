package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dto.Product;
import com.product.dto.Seller;
import com.product.repo.ProductRepository;
import com.product.repo.SellerRepository;

@Service
public class SellerServiceImple implements SellerService{

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	SellerRepository sellerRepository;
	
	@Override
	public void deleteProductById(Long sellerId) {

		productRepository.deleteBySellerId(sellerId);
		
	}

	@Override
	public List<Product> getProductBySellerId(Long sellerId) {

		return productRepository.findBySellerId(sellerId);

	}

	@Override
	public int updateProduct(String productCategory, String productType, String productname, Long sellerId) {
		
		return productRepository.updateBySellerId(productCategory, productType, productname, sellerId);
	
	}

	@Override
	public void addSellerWithProducts(Seller seller) {

		sellerRepository.save(seller);
		
	}

}
