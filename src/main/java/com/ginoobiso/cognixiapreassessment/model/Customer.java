	package com.ginoobiso.cognixiapreassessment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The Class Customer.
 */
@Entity
public class Customer {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	/** The name. */
	private String name;
	
	/** The phone number. */
	private Long phoneNumber;
	
	/**
	 * Instantiates a new customer.
	 */
	public Customer() {
		
	}
	
	/**
	 * Instantiates a new customer.
	 *
	 * @param name the name
	 * @param phoneNumber the phone number
	 */
	public Customer(String name, Long phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	} 

	
}
