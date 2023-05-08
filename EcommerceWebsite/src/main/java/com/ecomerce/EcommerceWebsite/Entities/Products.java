package com.ecomerce.EcommerceWebsite.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int productId;
	//private String catagoryId;
	private String productName;
	private int productQty;
	private double productprice;
	private String productDescrp;
	private boolean productAvailability;
	

}
