package com.dream.like.uk.dao;

import com.dream.like.uk.domain.entities.QuestionEntity;

/**
 * Created by Stacy on 4/23/16.
 */
public interface IQuestionDao {
    QuestionEntity getById(int id);
}
