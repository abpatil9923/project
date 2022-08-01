package com.product.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long productId;
	
	@Column(name = "product_name",nullable = false)
	private String productName; 
	
	@Column(name = "product_type")
	private String productType;
	
	@Column(name = "product_category")
	private String productCategory;

    @OneToOne(cascade =  CascadeType.ALL)
	private Price productPriceRange;


	public Product(String productName, String productType, String productCategory, Price productPriceRange) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.productCategory = productCategory;
		this.productPriceRange = productPriceRange;
	}

	public Product() {
		super();
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Price getProductPriceRange() {
		return productPriceRange;
	}

	public void setProductPriceRange(Price productPriceRange) {
		this.productPriceRange = productPriceRange;
	}
	
}