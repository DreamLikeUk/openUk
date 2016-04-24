package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.IUserQuestionDao;
import com.dream.like.uk.domain.entities.UserQuestionEntity;

/**
 * Created by Stacy on 4/24/16.
 */
public class UserQuestionDao extends BaseDao<UserQuestionEntity> implements IUserQuestionDao {
    @Override
    protected Class<UserQuestionEntity> getCurrentClass() {
        return UserQuestionEntity.class;
    }
}
