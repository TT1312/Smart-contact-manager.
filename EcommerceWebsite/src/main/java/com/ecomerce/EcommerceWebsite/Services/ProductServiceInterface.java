package com.ecomerce.EcommerceWebsite.Services;

import java.util.List;

import com.ecomerce.EcommerceWebsite.Entities.Products;

public interface ProductServiceInterface {

	List<Products> getproduct();


	String addproduct(Products product);


	String deleteproduct(Products product);


	String updateproduct(String productId, Products product);

	

	

}
