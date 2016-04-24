package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IUserQuestionDao;
import com.dream.like.uk.dao.impl.UserQuestionDao;
import com.dream.like.uk.domain.entities.QuestionEntity;
import com.dream.like.uk.domain.entities.UserEntity;
import com.dream.like.uk.domain.entities.UserQuestionEntity;
import com.dream.like.uk.services.IUserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by natalia on 4/24/16.
 */
public class UserQuestionServiceImpl implements IUserQuestionService {

    @Autowired
    private IUserQuestionDao userQuestionDao;

    public List<UserQuestionEntity> getAllUserQuestions() {
         List<UserQuestionEntity> allQuestions = new ArrayList<UserQuestionEntity>();
          for (UserQuestionEntity userQuest : userQuestionDao.get()) {
               allQuestions.add(userQuest);
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


    public int calculateUserPoints() {
        int userPoints = 0;
        List<UserQuestionEntity> questList =  getAllUserQuestions();
        for (int i = 0; i < questList.size(); i++) {
            userPoints += questList.get(i).getQuestion().getPoints();
        }
        return userPoints;
    }

    public UserQuestionEntity createNewUserToQuest(UserEntity user, QuestionEntity question) {
        if (user != null && question != null) {
            UserQuestionEntity theUserQuestion = new UserQuestionEntity();
            theUserQuestion.setUser(user);
            theUserQuestion.setQuestion(question);
            return theUserQuestion;
        } else {
            return null;
        }
    }


}
