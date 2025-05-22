package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService {
	
	public void addcustomer(Customer customer);
	public void deletecustomer(int id);
	public Customer getcustomer(int id);
	public List<Customer> getAllCustomers();
	public void deleteAllCustomers();

}
