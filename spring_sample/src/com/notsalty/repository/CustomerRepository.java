package com.notsalty.repository;

import java.util.List;

import com.notsalty.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}