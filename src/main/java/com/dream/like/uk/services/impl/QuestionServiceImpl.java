package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IDao;
import com.dream.like.uk.dao.IQuestionDao;
import com.dream.like.uk.domain.entities.QuestionEntity;
import com.dream.like.uk.services.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by natalia on 4/23/16.
 */

@Service
public class QuestionServiceImpl implements IQuestionService{

    @Autowired
    private IQuestionDao questionDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public QuestionEntity getById(int id) {
        return questionDao.getById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<QuestionEntity> getAll() {
        return null
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addQuestion(QuestionEntity aQuestion) {
        return -1;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean removeQuestion(QuestionEntity aQuestion, int id) {
        return false
    }
}
