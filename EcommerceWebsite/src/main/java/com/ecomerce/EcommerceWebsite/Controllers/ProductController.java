package com.ecomerce.EcommerceWebsite.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerce.EcommerceWebsite.Entities.Products;
import com.ecomerce.EcommerceWebsite.Services.ProductServiceInterface;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductServiceInterface productServiceInterface;
	
	@GetMapping("/all")
	public List<Products> getallproduct(){
		return this.productServiceInterface.getproduct();
		
	}
	
	@PostMapping("/addproduct")
	public String addproductitems(@RequestBody Products product) {
		return this.productServiceInterface.addproduct(product);
		
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestBody Products product) {
		return this.productServiceInterface.deleteproduct(product);
	}
	
	
	@PutMapping("/{productId}")
	public String update(@PathVariable("productId") String productId,@RequestBody Products product) {
		return this.productServiceInterface.updateproduct(productId,product);
		
	}

}
