package com.trotti.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trotti.api.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
