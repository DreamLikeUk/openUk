package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.IUserQuestionDao;
import com.dream.like.uk.domain.entities.QuestionEntity;
import com.dream.like.uk.domain.entities.UserQuestionEntity;
import com.google.common.collect.Lists;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stacy on 4/24/16.
 */
@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class UserQuestionDao extends BaseDao<UserQuestionEntity> implements IUserQuestionDao {
    @Override
    protected Class<UserQuestionEntity> getCurrentClass() {
        return UserQuestionEntity.class;
    }

    @Override
    public List<QuestionEntity> getQuestionsByUser(int userId){
    List<Criterion> criterions = Lists.<Criterion>newArrayList
            (Restrictions.eq("user.id", userId));
        List<UserQuestionEntity> userEntities = getByCriterions(criterions);
        if(userEntities == null)
            return  null;
        List<QuestionEntity> questionEntities = new ArrayList<QuestionEntity>();
        for(UserQuestionEntity u: userEntities)
        questionEntities.add(u.getQuestion());
            return questionEntities;
    }
}
