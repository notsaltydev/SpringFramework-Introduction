package com.notsalty.services;

import java.util.List;

import com.notsalty.model.Customer;
import com.notsalty.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	
	private CustomerRepository customerRepository;
	
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}


	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
