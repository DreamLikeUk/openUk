package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IAnswersDao;
import com.dream.like.uk.dao.IDao;
import com.dream.like.uk.domain.entities.AnswerEntity;
import com.dream.like.uk.services.IAnswerService;
import com.dream.like.uk.services.IDaoService;
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
public class AnswerServiceImpl extends IDaoServiceImpl implements IAnswerService {

    @Autowired
    private IAnswersDao answerDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public AnswerEntity getById(int id) {
          return answerDao.get(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<AnswerEntity> getAllAnswers() {
        return answerDao.get();
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addAnswer(AnswerEntity anAnswer) {
        if (anAnswer != null) {
            return answerDao.save(anAnswer);
        } else {
            return -1;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean removeAnswer(int id) {
         return false;
    }


}
