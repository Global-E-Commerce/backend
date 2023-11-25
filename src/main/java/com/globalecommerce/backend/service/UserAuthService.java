package com.globalecommerce.backend.service;

import com.globalecommerce.backend.entity.UserAuth;

import java.util.List;

public interface UserAuthService {
    UserAuth createUser(UserAuth user);
    UserAuth getUserById(Long id);
    List<UserAuth> getAllUsers();
    UserAuth updateUser(Long id, UserAuth user);
}
