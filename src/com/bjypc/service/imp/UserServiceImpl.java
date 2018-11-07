package com.bjypc.service.imp;
import com.bjypc.bean.User;
import com.bjypc.dao.UserDao;
import com.bjypc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 业务类
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }

    @Override
    public User findUserByUsername(User user) {
        return  userDao.findUserByUsername(user);
    }
}
