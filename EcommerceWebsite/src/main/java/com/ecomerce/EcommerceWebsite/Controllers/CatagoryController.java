package com.ecomerce.EcommerceWebsite.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.ecomerce.EcommerceWebsite.Entities.Catagory;
import com.ecomerce.EcommerceWebsite.Services.CatagoryServiceInterface;

@RestController
@RequestMapping("/catagory")
public class CatagoryController {
	
	@Autowired
	CatagoryServiceInterface catServiceInterface;

	@GetMapping("/all")
	public List<Catagory> getAll(){
		return this.catServiceInterface.getallcatagory();
		
	}
	
	@PostMapping("/addcatagory")
	public String addcatagory(@RequestBody Catagory catagory) {
		return this.catServiceInterface.addcatagoryitems(catagory);
		
	}
	
	@PutMapping("/updatecatagory")
	public String update(String catagoryId,Catagory catagory) {
		return this.catServiceInterface.updatecatagory(catagoryId,catagory);
		
	}
	
	@DeleteMapping("/deletecatagory")
	public String delete(@RequestBody Catagory catagoryId) {
		 return this.catServiceInterface.deletecatagory(catagoryId);
	}
	
	
}
