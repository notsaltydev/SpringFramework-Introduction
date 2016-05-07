package com.notsalty.repository;

import java.util.ArrayList;
import java.util.List;

import com.notsalty.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
		/* (non-Javadoc)
		 * @see com.notsalty.repository.CustomerRepository#findAll()
		 */
		@Override
		public List<Customer> findAll() {
		
		List <Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Bryan");
		customer.setLastName("Hansen");
		
		customers.add(customer);
		
		return customers;
		
	}

}
