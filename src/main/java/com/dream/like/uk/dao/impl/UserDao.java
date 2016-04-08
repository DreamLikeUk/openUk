package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.IUserDao;
import com.dream.like.uk.domain.entities.UserEntity;
import com.dream.like.uk.domain.enums.RoleEnum;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by Stacy on 4/8/16.
 */
@Repository
public class UserDao implements IUserDao {
   // @Autowired
   // private IBaseDao baseDao;
    //TODO to be replaced with the use of the base dao methods
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public UserEntity getUserById(int userId) {
        return null;
    }

    @Override
    public UserEntity getUserByMail(String mail) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(UserEntity.class);
        criteria.add(Restrictions.eq("email", mail));
        List<UserEntity> list = criteria.list();
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        return null;
    }

    @Override
    public boolean deleteUser(int userId) {
        return false;
    }

    @Override
    public RoleEnum getUserRole(UserEntity userEntity) {
        return null;
    }
}
