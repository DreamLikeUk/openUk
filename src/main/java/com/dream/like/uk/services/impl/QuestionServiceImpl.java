package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IQuestionDao;
import com.dream.like.uk.dao.IUserQuestionDao;
import com.dream.like.uk.domain.entities.CategoryEntity;
import com.dream.like.uk.domain.entities.QuestionEntity;
import com.dream.like.uk.domain.entities.UserEntity;
import com.dream.like.uk.services.ICategoryService;
import com.dream.like.uk.services.IQuestionService;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by natalia on 4/23/16.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class QuestionServiceImpl  implements IQuestionService{

    @Autowired
    private IQuestionDao questionDao;

    @Autowired
    private IUserQuestionDao userQuestionDao;

    @Autowired
    private ICategoryService categoryService;

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
    public List<QuestionEntity> getQuestionsByUser(int id) {
        return userQuestionDao.getQuestionsByUser(id);
    }

    @Override
    public List<Map<String, Object>> getQuestionsForUser(int id, int category) {
        Set<QuestionEntity> allQuestions = categoryService.getById(category).getQuestions();
        allQuestions.removeAll(getQuestionsByUser(id));
        List<Map<String, Object>>  questions = new ArrayList<Map<String, Object>>();
        int k = 0;
        for (QuestionEntity quest : allQuestions) {
            if(k == 10)
                break;
            questions.add(convert(quest));
            k++;
        }
        return questions;
    }


    private Map<String, Object> convert(QuestionEntity questionEntity){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id",questionEntity.getId());
        map.put("text",questionEntity.getText());
        map.put("points", questionEntity.getPoints());
        return map;
    }

}
