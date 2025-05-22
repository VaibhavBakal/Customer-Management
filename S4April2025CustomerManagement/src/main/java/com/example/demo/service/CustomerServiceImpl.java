package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public void addcustomer(Customer customer) {
		customerRepository.save(customer);
		
	}

	@Override
	public void deletecustomer(int id) {
		customerRepository.deleteById(id);
		
	}

	@Override
	public Customer getcustomer(int id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public void deleteAllCustomers() {
		customerRepository.deleteAll();
		
	}

}
