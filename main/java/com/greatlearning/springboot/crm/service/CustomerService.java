package com.greatlearning.springboot.crm.service;

import java.util.List;

import com.greatlearning.springboot.crm.model.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();

	void saveCustomer(Customer customer);

	Customer getCustomerById(Long id);

	void deleteCustomerById(Long id);

}
