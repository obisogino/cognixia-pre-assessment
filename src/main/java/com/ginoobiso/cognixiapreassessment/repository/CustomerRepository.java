package com.ginoobiso.cognixiapreassessment.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ginoobiso.cognixiapreassessment.model.Customer;

/**
 * The Interface CustomerRepository.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	public List<Customer> findAll();
	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the optional
	 */
	public Optional<Customer> findById(Long id);
	
	/**
	 * Find by name.
	 *
	 * @param name the name
	 * @return the optional
	 */
	public Optional<Customer> findByName(String name);
}
