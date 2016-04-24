package com.dream.like.uk.dao;

import com.dream.like.uk.domain.entities.AnswerEntity;

import java.util.List;

/**
 * Created by Stacy on 4/23/16.
 */
public interface IAnswersDao {
    /**
     * Get all
     * @return
     */
    List<AnswerEntity> get();

    /**
     * get by id
     * @param id
     * @return
     */
    AnswerEntity get(Integer id);

    /**
     * update + save
     * @param answerEntity
     * @return
     */
    AnswerEntity update(AnswerEntity answerEntity);
    boolean delete(int id);
}
