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
public class Catagory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int catagoryId;
	
	private String catagoryName;
}
