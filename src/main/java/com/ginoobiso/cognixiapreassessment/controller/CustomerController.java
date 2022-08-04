package com.ginoobiso.cognixiapreassessment.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ginoobiso.cognixiapreassessment.model.Customer;
import com.ginoobiso.cognixiapreassessment.service.CustomerService;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomerController.
 */
@Controller
public class CustomerController {

	/** The customer service. */
	@Autowired
	CustomerService customerService;

	/**
	 * Gets the customers by name.
	 *
	 * @param name the name
	 * @return the customers by name
	 */
	@RequestMapping("/customer")
	@ResponseBody
	public List<Customer> getCustomersByName(@RequestParam(required = false) String name) {

		if (StringUtils.isEmpty(name)) {
			return customerService.getCustomers();
		}
		return customerService.getCustomerbyName(name);

	}

	/**
	 * Gets the customers by id.
	 *
	 * @param id the id
	 * @return the customers by id
	 */
	@RequestMapping("/customer/{id}")
	@ResponseBody
	public  ResponseEntity<Customer> getCustomersById(@PathVariable Long id) {
		Customer customer = null;
		try {
			customer = customerService.getCustomerbyId(id);
		} catch (Exception e) {

			return new ResponseEntity<Customer>(customer, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);

	}

	/**
	 * Creates the customer.
	 *
	 * @param customer the customer
	 */
	@PostMapping(path = "/customer", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void createCustomer(@RequestBody Customer customer) {

		customerService.createCustomer(customer);

	}

	/**
	 * Delete customer.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@DeleteMapping(value = "/customer/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Long id) {

		try {
			customerService.deleteCustomer(id);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>("", HttpStatus.OK);
	}

}
