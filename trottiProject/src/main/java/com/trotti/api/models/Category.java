package com.trotti.api.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Category;
	private String name;
	
	@OneToMany(mappedBy = "category")
	private List<Product>product;
}
