package com.product.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.dto.Product;
import com.product.dto.Seller;
import com.product.service.ProductService;
import com.product.service.SellerService;

import Response.Response;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@Autowired
	SellerService sellerService;
	
	@GetMapping(value = "/products")
	public List<Product> getProducts(){
		
		return productService.getProducts();	
	}
	
	@GetMapping(value = "/product_type/{product_type}")
	public List<Product> getProductsByType(@PathVariable("product_type") String productType){
		
		return productService.getProductByProductType(productType);	
	}
	
	@GetMapping(value = "/product_category/{product_category}")
	public List<Product> getProductsByCategory(@PathVariable("product_category") String productCategory){
		
		return productService.getProductByProductCategory(productCategory);	
	}

	@GetMapping(value = "/product_name/{product_name}")
	public List<Product> getProductsByName(@PathVariable("product_name") String productName){
		
		return productService.getProductByProductName(productName);	
	}
	
	@PostMapping(value = "/add_product")
	public Response addProduct(@RequestBody Seller seller){
		
		try {
			
			sellerService.addSellerWithProducts(seller);
			
			return new Response("200", "successfully added");
		} catch (Exception e) {
			
			return new Response("500", e.getMessage());
		}
	}
	
	@GetMapping(value = "/products_by_sellerid/{seller_id}")
	public List<Product> getProductsBySellerId(@PathVariable("seller_id") Long sellerId){
		
		return sellerService.getProductBySellerId(sellerId);
	}
	
	@DeleteMapping(value = "delete_by_sellerid/{seller_id}")
	public void deletProductsBySellerId(@PathVariable("seller_id") Long sellerId){
		
		sellerService.deleteProductById(sellerId);
	}
	
}
