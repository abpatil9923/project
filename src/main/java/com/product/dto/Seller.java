package com.product.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sellerId;
	
	@Column(name = "seller_name")
	private String sellerName;
	
	@Column(name = "sellerMobile")
	private String sellerMobile;
	
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
	private List<Product> products;


	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Seller(String sellerName, String sellerMobile, List<Product> products) {
		super();
		this.sellerName = sellerName;
		this.sellerMobile = sellerMobile;
		this.products = products;
	}


	public Long getSellerId() {
		return sellerId;
	}


	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}


	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public String getSellerMobile() {
		return sellerMobile;
	}


	public void setSellerMobile(String sellerMobile) {
		this.sellerMobile = sellerMobile;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}	
}
