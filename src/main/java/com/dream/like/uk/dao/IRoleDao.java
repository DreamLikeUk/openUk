package com.dream.like.uk.dao;

import com.dream.like.uk.domain.entities.QuestionEntity;
import com.dream.like.uk.domain.entities.RoleEntity;

import java.util.List;

/**
 * Created by Stacy on 4/24/16.
 */
public interface IRoleDao {
    List<RoleEntity> get();
    RoleEntity get(Integer id);

}
