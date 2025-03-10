package com.trotti.api.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Subscription {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Subscription;
	private String name;
	private String descriptionSubscription;
	private LocalDate dSubscription;
	private Double subscriptionCost;
	
	@ManyToOne
	@JoinColumn(name= "id_customer")
	private Customer customer;
}
