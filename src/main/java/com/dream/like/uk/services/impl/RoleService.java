package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IRoleDao;
import com.dream.like.uk.domain.entities.RoleEntity;
import com.dream.like.uk.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Stacy on 4/24/16.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class RoleService implements IRoleService {
    @Autowired
    private IRoleDao roleDao;
    @Override
    public RoleEntity getRole(int id) {
        return roleDao.get(id);
    }
}
