package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IQuestionDao;
import com.dream.like.uk.domain.entities.CategoryEntity;
import com.dream.like.uk.domain.entities.QuestionEntity;
import com.dream.like.uk.services.IQuestionService;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by natalia on 4/23/16.
 */

@Service
public class QuestionServiceImpl extends DaoServiceImpl implements IQuestionService{

    @Autowired
    private IQuestionDao questionDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public QuestionEntity getById(int id) {
        return questionDao.get(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map<String,Object>>  getAllQuestions() {
        List<Map<String, Object>>  questions = new ArrayList<Map<String, Object>>();
        for (QuestionEntity quest : questionDao.get()) {
            questions.add(convert(quest));
        }
        return questions;
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addQuestion(QuestionEntity aQuestion) {
        if (aQuestion != null) {
             questionDao.update(aQuestion);
            return 0;
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

    private Map<String, Object> convert(QuestionEntity questionEntity){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("text",questionEntity.getText());
        map.put("points", questionEntity.getPoints());
        map.put("image_link", questionEntity.getLink());
        return map;
    }

}
