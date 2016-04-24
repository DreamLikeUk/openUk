package com.dream.like.uk.services;

import com.dream.like.uk.domain.entities.QuestionEntity;

import java.util.List;

/**
 * Created by natalia on 4/23/16.
 */
public interface IQuestionService {
    QuestionEntity getById(int id);

    List<QuestionEntity> getAll();

    int addQuestion(QuestionEntity aQuestion);

    boolean removeQuestion(int id);
}
