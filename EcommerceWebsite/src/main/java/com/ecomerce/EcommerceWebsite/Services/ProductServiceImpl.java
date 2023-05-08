package com.ecomerce.EcommerceWebsite.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.EcommerceWebsite.Entities.Products;
import com.ecomerce.EcommerceWebsite.Repository.productrepository;

@Service
public class ProductServiceImpl implements ProductServiceInterface{

	@Autowired
	productrepository productrepository;

	@Override
	public List<Products> getproduct() {
		
		return productrepository.findAll();
	}

	
	public String addproduct(Products product) {
		productrepository.save(product);
		return "Product add successfully";
	}


	@Override
	public String deleteproduct(Products product) {
		productrepository.delete(product);
		return "Delete Successfully";
	}


	@Override
	public String updateproduct(String productId, Products product) {
		Optional<Products> newproduct = productrepository.findById(productId);
		Products update = newproduct.get();
		update.setProductId(product.getProductId());
		update.setProductName(product.getProductName());
		update.setProductQty(product.getProductQty());
		update.setProductprice(product.getProductprice());
		update.setProductDescrp(product.getProductDescrp());
		update.setProductAvailability(true);
		
		productrepository.save(update);
		return "Update successfully!";
	}
	
	
	
	
}
