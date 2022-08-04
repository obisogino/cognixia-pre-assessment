package com.ginoobiso.cognixiapreassessment.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ginoobiso.cognixiapreassessment.model.Customer;
import com.ginoobiso.cognixiapreassessment.repository.CustomerRepository;
import com.ginoobiso.cognixiapreassessment.service.CustomerService;

/**
 * The Class CustomerServiceImpl.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	/** The customer repository. */
	@Autowired
	CustomerRepository customerRepository;

	/**
	 * Gets the customers.
	 * 
	 * @return the customers
	 */
	@Override
	public List<Customer> getCustomers() {
		return customerRepository.findAll();

	}

	/**
	 * Gets the customerby id.
	 *
	 * @param id the id
	 * @return the customerby id
	 * @throws Exception the exception
	 */
	@Override
	public Customer getCustomerbyId(Long id) throws Exception {
		return customerRepository.findById(id).orElseThrow(() -> new Exception("customer not found"));
	}

	/**
	 * Gets the customerby name.
	 *
	 * @param name the name
	 * @return the customerby name
	 */
	@Override
	public List<Customer> getCustomerbyName(String name) {
		return customerRepository.findByName(name).stream().collect(Collectors.toList());
	}

	/**
	 * Creates the customer.
	 *
	 * @param customer the customer
	 */
	@Override
	public void createCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	/**
	 * Delete customer.
	 *
	 * @param id the id
	 * @throws Exception the exception
	 */
	@Override
	public void deleteCustomer(Long id) throws Exception {

		Customer customer = customerRepository.findById(id).orElseThrow(() -> new Exception("customer not found"));
		customerRepository.delete(customer);

	}

}
