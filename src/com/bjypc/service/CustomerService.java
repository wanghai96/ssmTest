package com.bjypc.service;

import com.bjypc.bean.Customer;

import java.util.List;

/**
 * Created by jsjx on 2018/6/14.
 */
public interface CustomerService {
    public Customer findCustomerById(Integer id);
    public List<Customer> findCustomerAll();
    public void updateCustomer(Customer customer);
    public void deleteCustomer(Integer id);
    public void insertCustomer(Customer customer);
}
