package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.IQuestionDao;
import com.dream.like.uk.domain.entities.QuestionEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Stacy on 4/23/16.
 */
@Repository
public class QuestionDao extends BaseDao<QuestionEntity> implements IQuestionDao {
    @Override
    protected Class<QuestionEntity> getCurrentClass() {
        return QuestionEntity.class;
    }
}
