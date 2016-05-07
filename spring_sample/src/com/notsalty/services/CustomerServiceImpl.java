package com.notsalty.services;

import java.util.List;

import com.notsalty.model.Customer;
import com.notsalty.repository.CustomerRepository;
import com.notsalty.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
