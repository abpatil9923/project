package com.product.repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.product.dto.Price;
import com.product.dto.Product;
import com.product.dto.Seller;

@SpringBootTest
public class ProductRepoTest {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Test
	void findByProductCategory() {
	
		Price price = new Price(1000L, 1200L);	
		Product product =  new Product("rebook", "shoes", "Footwear", price);
	
		List<Product> list = new ArrayList<Product>();
		list.add(product);
		
		Seller seller = new Seller("Atul", "172639212", list);
	
		sellerRepository.save(seller);

		assertThat(productRepository.findByProductCategory("Footwear").isEmpty()).isEqualTo(false);
		
	}
	
	@Test
	void findByProductName() {
	
		Price price = new Price(1000L, 1200L);	
		Product product =  new Product("rebook", "shoes", "Footwear", price);
	
		List<Product> list = new ArrayList<Product>();
		list.add(product);
		
		Seller seller = new Seller("Atul", "172639212", list);
	
		sellerRepository.save(seller);

		assertThat(productRepository.findByProductName("rebook").isEmpty()).isEqualTo(false);
		
	}
	
	@Test
	void findByProductType() {
	
		Price price = new Price(1000L, 1200L);	
		Product product =  new Product("rebook", "shoes", "Footwear", price);
	
		List<Product> list = new ArrayList<Product>();
		list.add(product);
		
		Seller seller = new Seller("Atul", "172639212", list);
	
		sellerRepository.save(seller);

		assertThat(productRepository.findByProductType("shoes").isEmpty()).isEqualTo(false);
		
	}
	
	@Test
	void findBySellerId() {
		
		Price price = new Price(1000L, 1200L);	
		Product product =  new Product("rebook", "shoes", "Footwear", price);
	
		List<Product> list = new ArrayList<Product>();
		list.add(product);
		
		Seller seller = new Seller("Atul", "172639212", list);
	
		sellerRepository.save(seller);

		//passing 1L because id is auto generated will start from 1
		assertThat(productRepository.findBySellerId(1L).isEmpty()).isEqualTo(false);
	}

}
