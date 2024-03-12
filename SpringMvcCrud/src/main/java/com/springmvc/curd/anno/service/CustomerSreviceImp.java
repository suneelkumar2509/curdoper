package com.springmvc.curd.anno.service;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.curd.anno.dao.CustomerDAO;
import com.springmvc.curd.anno.entity.Customer;

@Entity
@Table(name = "customer")
public class CustomerSreviceImp implements CustomerService  {
	
	
	
	
	@Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List < Customer > getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {
        customerDAO.saveCustomer(theCustomer);
    }

    @Override
    @Transactional
    public Customer getCustomer(int theId) {
        return customerDAO.getCustomer(theId);
    }

    @Override
    @Transactional
    public void deleteCustomer(int theId) {
        customerDAO.deleteCustomer(theId);
    }


	}


