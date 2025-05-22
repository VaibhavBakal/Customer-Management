package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("customer")
	public String addcustome(@RequestBody Customer customer) {
		customerService.addcustomer(customer);
		return "customer added successfully!";
	}
	
	@DeleteMapping("customer/{id}")
	public String deletecustomer(@PathVariable("id")int id) {
		customerService.deletecustomer(id);
		return "customer deleted successfully!";
		
	}
	@GetMapping("customer/{id}")
	public Customer getcustomer(@PathVariable("id")int id) {
	   return 	customerService.getcustomer(id);
	   
	}
	
	@GetMapping("customers")
	public List<Customer> getAllcustomer(){
		return customerService.getAllCustomers();
	}
	
	@DeleteMapping("customers")
	public String deleteAllcustomer() {
		customerService.deleteAllCustomers();
		return "All customers deleted successfully!";
		
		
		
	}

}
