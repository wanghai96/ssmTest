package com.bjypc.controller;

import com.bjypc.bean.Customer;
import com.bjypc.bean.User;
import com.bjypc.service.CustomerService;
import com.bjypc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by jsjx on 2018/6/20.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/findUserById")
    public String findCustomerById(Integer id, Model model, HttpServletRequest request){
        User user=userService.findUserById(id);
        if(user!=null)
        {
            model.addAttribute("user",user);
            request.getSession().setAttribute("user",user);//登录用户的信息存放在session里，方便在多个页面之间共享数据
            return "main";
        }else
        {
            return "error";
        }
    }
    @RequestMapping("/findUserByUsername")
    public String findCustomerByUsername(User user, Model model, HttpServletRequest request){
        User usertemp=userService.findUserByUsername(user);
        if(usertemp!=null)
        {
            //登录成功，直接获取到全部顾客信息
            List<Customer> customerList=customerService.findCustomerAll();
            model.addAttribute("user",usertemp);
            model.addAttribute("customerList",customerList);
            request.getSession().setAttribute("user",usertemp);//登录用户的信息存放在session里，方便在多个页面之间共享数据
            return "main";
        }else
        {
            return "error";
        }
    }
}
