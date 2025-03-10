package com.trotti.api.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trotti.api.models.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@PostMapping()
	public void createCustomer(@RequestBody Customer customer) {
		
	}
}
