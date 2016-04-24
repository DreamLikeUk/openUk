package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IUserQuestionDao;
import com.dream.like.uk.dao.impl.UserQuestionDao;
import com.dream.like.uk.domain.entities.UserQuestionEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by natalia on 4/24/16.
 */
public class UserQuestionServiceImpl implements IUserQuestionDao {

    @Autowired
    private IUserQuestionDao userQuestionDao;

    public List<UserQuestionEntity> get() {
         List<UserQuestionEntity> allQuestions = new ArrayList<UserQuestionEntity>();
          for (UserQuestionEntity userAnsw : userQuestionDao.get()) {
               allQuestions.add(userAnsw);
          }
        return allQuestions;
    }

    public UserQuestionEntity get(Integer id) {
          return userQuestionDao.get(id);
    }

    public UserQuestionEntity update(UserQuestionEntity answerEntity) {
         if (answerEntity != null) {
             return  userQuestionDao.update(answerEntity);
         } else {
             return null;
         }
    }

    public boolean delete(int id) {
        return userQuestionDao.delete(id);
    }



}
