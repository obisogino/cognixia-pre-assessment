package com.ginoobiso.cognixiapreassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ginoobiso.cognixiapreassessment.model.Customer;
import com.ginoobiso.cognixiapreassessment.repository.CustomerRepository;

/**
 * The Class CognixiaPreAssessmentApplication.
 */
@SpringBootApplication
public class CognixiaPreAssessmentApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		
		ConfigurableApplicationContext configurableApplicationContext 
		= SpringApplication.run(CognixiaPreAssessmentApplication.class, args);
		
		CustomerRepository customerRepo 
		= configurableApplicationContext.getBean(CustomerRepository.class);
		
		Customer customer = new Customer("Gino", 639994006000L);
		customerRepo.save(customer);
	}

}
