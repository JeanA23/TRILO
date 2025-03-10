package com.trotti.api.models;

import java.time.LocalDate;
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
public class Customer {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Customer;
	private String surname;
	private String name;
	private LocalDate dBirth;
	private String email;
	private String password;
	
	@OneToMany(mappedBy = "customer")
	private List<Product>product;
	
	@OneToMany(mappedBy = "customer")
	private List<Reservation> reservation;
	
	@OneToMany(mappedBy = "customer")
	private List<Subscription> subscription;
}
