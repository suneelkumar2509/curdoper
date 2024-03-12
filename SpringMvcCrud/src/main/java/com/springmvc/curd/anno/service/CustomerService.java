package com.springmvc.curd.anno.service;

import java.util.List;

import com.springmvc.curd.anno.entity.Customer;

public interface CustomerService {
	public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);


}
