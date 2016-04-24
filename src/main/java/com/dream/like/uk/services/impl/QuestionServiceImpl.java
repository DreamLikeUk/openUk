package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IDao;
import com.dream.like.uk.dao.IQuestionDao;
import com.dream.like.uk.domain.entities.QuestionEntity;
import com.dream.like.uk.services.IQuestionService;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by natalia on 4/23/16.
 */

@Service
public class QuestionServiceImpl extends IDaoServiceImpl implements IQuestionService{

    @Autowired
    private IQuestionDao questionDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public QuestionEntity getById(int id) {
        return questionDao.get(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<QuestionEntity> getAll() {
        return questionDao.get();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addQuestion(QuestionEntity aQuestion) {
        if (aQuestion != null) {
            return questionDao.save(aQuestion);
        } else {
            return -1;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean removeQuestion(int id) {
        return questionDao.delete(id);
    }

    @Override
    public <T> Number count(Class<T> currentClass, Criterion... eq) {
        return null;
    }
}
