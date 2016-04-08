package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IUserDao;
import com.dream.like.uk.domain.entities.UserEntity;
import com.dream.like.uk.domain.enums.RoleEnum;
import com.dream.like.uk.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Stacy on 4/7/16.
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserEntity getUserById(int userId) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserEntity getUserByMail(String mail) {
        return userDao.getUserByMail(mail);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserEntity updateUser(UserEntity user) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteUser(int userId) {
        return false;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public RoleEnum getUserRole(UserEntity userEntity) {
        return null;
    }
}
