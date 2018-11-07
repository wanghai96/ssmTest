package com.bjypc.controller;

import com.bjypc.bean.Customer;
import com.bjypc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jsjx on 2018/6/14.
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping("/findCustomerById")
    public String findCustomerById(Integer id,Model model){
        Customer customer=customerService.findCustomerById(id);
        model.addAttribute("customer",customer);
        return "customer";
    }
    @RequestMapping("/findCustomerAll")
    public String findCustomerAll(Model model){
        List<Customer> customerList=customerService.findCustomerAll();
        model.addAttribute("customerList",customerList);
        return "main";
    }
    @RequestMapping("/updateCustomerById")
    public String updateCustomerById(Integer id,Model model){
        Customer customer=customerService.findCustomerById(id);
        model.addAttribute("customer",customer);
        return "updatecustomer";
    }
    @RequestMapping("/updateCustomer")
    public String updateCustomer(Customer customer,Model model){
        try{
            customerService.updateCustomer(customer);
            List<Customer> customerList=customerService.findCustomerAll();
            model.addAttribute("customerList",customerList);
            return "main";
        }catch (Exception ex)
        {
            return "error";
        }
    }
    @RequestMapping("/deleteCustomerById")
    public String deleteCustomerById(Integer id,Model model)
    {
        try{
            customerService.deleteCustomer(id);
            List<Customer> customerList=customerService.findCustomerAll();
            model.addAttribute("customerList",customerList);
            return "main";
        }catch (Exception ex)
        {
            return "error";
        }
    }
    @RequestMapping("/ahrefinsertCustomer")
    public String insertCustomer() {
        return "insertcustomer";
    }
    @RequestMapping("/insertCustomer")
    public String insertCustomer(Customer customer,Model model) {
        try{
            customerService.insertCustomer(customer);
            List<Customer> customerList=customerService.findCustomerAll();
            model.addAttribute("customerList",customerList);
            return "main";
        }catch (Exception ex)
        {
            return "error";
        }
    }
}
