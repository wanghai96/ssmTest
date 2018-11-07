package com.bjypc.service;

import com.bjypc.bean.User;

/**
 * Created by jsjx on 2018/6/20.
 */
public interface UserService {
    public User findUserById(Integer id);
    public User findUserByUsername(User user);
}
