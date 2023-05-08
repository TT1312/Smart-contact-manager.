package com.ecomerce.EcommerceWebsite.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.EcommerceWebsite.Entities.Catagory;
import com.ecomerce.EcommerceWebsite.Repository.catagoryrepository;

@Service
public class CatagoryServiceImpl implements CatagoryServiceInterface{
	
	@Autowired
	catagoryrepository catagoryrepository;

	
	// GetMapping
	public List<Catagory> getallcatagory() {
		
		return catagoryrepository.findAll();
	}

	
	// PostMapping
	public String addcatagoryitems(Catagory catagory) {
		catagoryrepository.save(catagory);
		return "Catagory Add Successfully";
	}

	
	// PutMapping
	@Override
	public String updatecatagory(String catagoryId, Catagory catagory) {
		Optional<Catagory> update = catagoryrepository.findById(catagoryId);
		if (update.isPresent()) {
			Catagory newupdate = update.get();
			newupdate.setCatagoryId(catagory.getCatagoryId());
			newupdate.setCatagoryName(catagory.getCatagoryName());
			
			catagoryrepository.save(newupdate);
			return "update successfully";
		}
		else {
			return "Catagory Details not updated because catagoryId Not Found";
		}
		
	}

	
	// DeleteMapping
	
	public String deletecatagory(Catagory catagoryId) {
		catagoryrepository.delete(catagoryId);
		return "Catagory Delete Successfully..";
	}

	
	
		

}
