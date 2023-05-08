package com.ecomerce.EcommerceWebsite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomerce.EcommerceWebsite.Entities.Products;

public interface productrepository extends JpaRepository<Products, String>{

}
