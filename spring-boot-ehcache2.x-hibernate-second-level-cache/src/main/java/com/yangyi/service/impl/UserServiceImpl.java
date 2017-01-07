package com.yangyi.service.impl;

import com.yangyi.dao.UserRepo;
import com.yangyi.entity.User;
import com.yangyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yangjinfeng on 2016/12/30.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User get(Long userId) {
        return userRepo.findOne(userId);
    }
}
