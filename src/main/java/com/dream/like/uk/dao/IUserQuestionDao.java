package com.dream.like.uk.dao;


import com.dream.like.uk.domain.entities.UserQuestionEntity;

import java.util.List;

/**
 * Created by Stacy on 4/24/16.
 */
public interface IUserQuestionDao {
    /**
     * Get all
     * @return
     */
    List<UserQuestionEntity> get();

    /**
     * get by id
     * @param id
     * @return
     */
    UserQuestionEntity get(Integer id);

    /**
     * update + save
     * @param answerEntity
     * @return
     */
    UserQuestionEntity update(UserQuestionEntity answerEntity);
    boolean delete(int id);
}
