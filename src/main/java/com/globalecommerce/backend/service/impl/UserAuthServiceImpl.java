package com.globalecommerce.backend.service.impl;

import com.globalecommerce.backend.dao.UserAuthDao;
import com.globalecommerce.backend.entity.UserAuth;
import com.globalecommerce.backend.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAuthServiceImpl implements UserAuthService {

    @Autowired
    private UserAuthDao userAuthDao;

    @Override
    public UserAuth createUser(UserAuth user) {
        userAuthDao.insertUserAuth(user);
        return user;
    }

    @Override
    public UserAuth getUserById(Long id) {
        return userAuthDao.selectUserAuthById(id);
    }


    @Override
    public List<UserAuth> getAllUsers() {
        return userAuthDao.selectAllUsers();
    }

    @Override
    public UserAuth updateUser(Long id, UserAuth user) {
        user.setId(id);
        userAuthDao.updateUserAuth(user);
        return user;
    }
}
