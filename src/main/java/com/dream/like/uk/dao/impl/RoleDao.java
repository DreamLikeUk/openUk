package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.IRoleDao;
import com.dream.like.uk.domain.entities.RoleEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Stacy on 4/24/16.
 */
@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class RoleDao extends BaseDao<RoleEntity> implements  IRoleDao {
    @Override
    protected Class<RoleEntity> getCurrentClass() {
        return RoleEntity.class;
    }
}
