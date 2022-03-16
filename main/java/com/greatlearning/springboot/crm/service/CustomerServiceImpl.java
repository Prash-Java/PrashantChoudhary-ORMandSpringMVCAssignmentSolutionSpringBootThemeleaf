package com.greatlearning.springboot.crm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.springboot.crm.model.Customer;
import com.greatlearning.springboot.crm.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) {
		this.customerRepository.save(customer);

	}

	@Override
	public Customer getCustomerById(Long id) {
		Optional<Customer> optional = customerRepository.findById(id);
		Customer customer = null;
		if (optional.isPresent()) {
			customer = optional.get();
		} else {
			throw new RuntimeException("Customer Is Not Available For Given Id :" + id);
		}
		return customer;
	}

	@Override
	public void deleteCustomerById(Long id) {
		this.customerRepository.deleteById(id);

	}

}
