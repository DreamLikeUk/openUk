package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.IAnswersDao;
import com.dream.like.uk.domain.entities.AnswerEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by Stacy on 4/23/16.
 */
@Repository
public class AnswerDao extends BaseDao<AnswerEntity> implements IAnswersDao {
    @Override
    protected Class<AnswerEntity> getCurrentClass() {
        return AnswerEntity.class;
    }

    @Override
    public AnswerEntity getById(int id) {
        return get(id);
    }
}
