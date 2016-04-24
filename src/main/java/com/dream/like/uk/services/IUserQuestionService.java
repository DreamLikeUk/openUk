package com.dream.like.uk.services;

import com.dream.like.uk.domain.entities.UserQuestionEntity;

import java.util.List;

/**
 * Created by natalia on 4/24/16.
 */
public interface IUserQuestionService {


    List<UserQuestionEntity> getAllUserQuestions();

    UserQuestionEntity get(Integer id);


    UserQuestionEntity update(UserQuestionEntity answerEntity);
    boolean delete(int id);

    int calculateUserPoints();
}
