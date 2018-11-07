package com.bjypc.service.imp;

import com.bjypc.bean.Customer;
import com.bjypc.dao.CustomerDao;
import com.bjypc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务类
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Override
    public Customer findCustomerById(Integer id) {
        return  customerDao.findCustomerById(id);
    }

    @Override
    public List<Customer> findCustomerAll() {
        return customerDao.findCustomerAll();
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerDao.deleteCustomer(id);
    }

    @Override
    public void insertCustomer(Customer customer) {
        customerDao.insertCustomer(customer);
    }
}
