package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.IUserDao;
import com.dream.like.uk.domain.entities.UserEntity;
import com.dream.like.uk.domain.enums.RoleEnum;
import com.google.common.collect.Lists;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by Stacy on 4/8/16.
 */
@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class UserDao extends BaseDao<UserEntity> implements IUserDao {


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserEntity getUserByMail(String mail) {
        List<Criterion> criterions = Lists.<Criterion>newArrayList
                (Restrictions.like("email", mail));
        List<UserEntity> userEntities = getByCriterions(criterions);
        return userEntities.size()>0? userEntities.get(0):null;

    }

    @Override
    protected Class<UserEntity> getCurrentClass() {
        return UserEntity.class;
    }
}
