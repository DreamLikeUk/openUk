package com.dream.like.uk.services;

import com.dream.like.uk.domain.entities.CategoryEntity;
import com.dream.like.uk.domain.entities.QuestionEntity;
import com.dream.like.uk.domain.entities.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by natalia on 4/23/16.
 */
public interface IQuestionService {
    QuestionEntity getById(int id);

    List<Map<String,Object>>  getAllQuestions();

    int addQuestion(QuestionEntity aQuestion);

    boolean removeQuestion(int id);

    List<QuestionEntity> getQuestionsByUser(int userEntity);

    List<Map<String,Object>> getQuestionsForUser(int userEntity, int category);

    boolean putAnswer(int user, int question);
}
