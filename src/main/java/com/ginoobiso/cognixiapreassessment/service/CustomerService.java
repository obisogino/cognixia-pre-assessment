package com.ginoobiso.cognixiapreassessment.service;

import java.util.List;

import com.ginoobiso.cognixiapreassessment.model.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	
//	public Customer s(Long id) throws Exception ;
	
	public List<Customer> getCustomerbyName(String id);
	
	public void createCustomer(Customer customer);
	
	public void deleteCustomer(Long id) throws Exception;

	Customer getCustomerbyId(Long id) throws Exception;

}
