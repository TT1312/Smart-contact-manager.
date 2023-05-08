package com.ecomerce.EcommerceWebsite.Services;

import java.util.List;

import com.ecomerce.EcommerceWebsite.Entities.Catagory;

public interface CatagoryServiceInterface {

	List<Catagory> getallcatagory();

	String addcatagoryitems(Catagory catagory);

	String updatecatagory(String catagoryId, Catagory catagory);

	

	String deletecatagory(Catagory catagoryId);

	
	
}
