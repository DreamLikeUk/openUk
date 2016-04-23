package com.dream.like.uk.dao;

import com.dream.like.uk.domain.entities.AnswerEntity;

/**
 * Created by Stacy on 4/23/16.
 */
public interface IAnswersDao {
    AnswerEntity getById(int id);
}
