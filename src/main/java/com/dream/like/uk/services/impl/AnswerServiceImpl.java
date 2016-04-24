package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IAnswersDao;
import com.dream.like.uk.domain.entities.AnswerEntity;
import com.dream.like.uk.services.IAnswerService;
import com.dream.like.uk.services.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by natalia on 4/23/16.
 */

@Service
public class AnswerServiceImpl implements IAnswerService {

    @Autowired
    private IAnswersDao answerDao;

    @Autowired
    private IQuestionService questionService;
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public AnswerEntity getById(int id) {
          return answerDao.get(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map<String,Object>> getAllAnswers() {
        List<Map<String, Object>> answers = new ArrayList<Map<String, Object>>();
        for (AnswerEntity answ : answerDao.get()) {
             answers.add(convert(answ));
        }
        return answers;
    }



    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addAnswer(AnswerEntity anAnswer) {
        if (anAnswer != null) {
             answerDao.update(anAnswer);
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean removeAnswer(int id) {
         return false;
    }

    @Override
    public List<Map<String, Object>> getAnswersByQuestion(int id) {
        Set<AnswerEntity> answerEntities = questionService.getById(id).getAnswers();
        List<Map<String, Object>> answers = new ArrayList<Map<String, Object>>();
        for (AnswerEntity answ : answerDao.get()) {
            answers.add(convert(answ));
        }
        return answers;
    }

    private Map<String, Object> convert(AnswerEntity answerEntity){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("text",answerEntity.getText());
        map.put("correct", answerEntity.isCorrect());
        return map;
    }
}
