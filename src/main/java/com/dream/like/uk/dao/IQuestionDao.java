package com.dream.like.uk.dao;

import com.dream.like.uk.domain.entities.QuestionEntity;

import java.util.List;

/**
 * Created by Stacy on 4/23/16.
 */
public interface IQuestionDao {
    List<QuestionEntity> get();
    QuestionEntity get(Integer id);

    /**
     * works for update and save
     * @param questionEntity
     * @return
     */
    QuestionEntity update(QuestionEntity questionEntity);

    boolean delete(int id);
}
