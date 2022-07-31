package com.product.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.product.dto.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	public List<Product> findByProductCategory(String productCategory);
	
	public List<Product> findByProductName(String productName);
	
	public List<Product> findByProductType(String productType);
	
	@Query(value = "SELECT * FROM Product p WHERE p.products_seller_id = ?", nativeQuery = true)
	public List<Product> findBySellerId(Long sellerId);
	
	@Modifying
	@Query(value = "UPDATE Product p set p.product_category = ?, p.product_type = ?,p.product_name = ? where p.products_seller_id = ?", 
	  nativeQuery = true)
	public int updateBySellerId(String productCategory, String productType, String productname, Long sellerId);
	
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM Product where products_seller_id = ?1 ; ", nativeQuery = true)
	public void deleteBySellerId(Long sellerId);
	
}

