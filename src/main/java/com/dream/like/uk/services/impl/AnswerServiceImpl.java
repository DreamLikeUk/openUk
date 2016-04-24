package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IAnswersDao;
import com.dream.like.uk.domain.entities.AnswerEntity;
import com.dream.like.uk.services.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by natalia on 4/23/16.
 */

@Service
public class AnswerServiceImpl implements IAnswerService {

    @Autowired
    private IAnswersDao answerDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public AnswerEntity getById(int id) {
          return answerDao.getById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addAnswer(AnswerEntity anAnswer) {
       return -1;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean removeAnswer(AnswerEntity anAnswer, int id) {
         return false;
    }
}
