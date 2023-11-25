package com.globalecommerce.backend.dao;

import com.globalecommerce.backend.entity.UserAuth;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserAuthDao {
    UserAuth selectUserAuthById(Long id);
    void insertUserAuth(UserAuth userAuth);
    void updateUserAuth(UserAuth userAuth);
    List<UserAuth> selectAllUsers();
}

