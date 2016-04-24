package com.dream.like.uk.services;

import com.dream.like.uk.domain.entities.AnswerEntity;
import com.dream.like.uk.domain.entities.BadgeEntity;

import java.util.List;

/**
 * Created by natalia on 4/23/16.
 */
public interface IAnswerService {

    AnswerEntity getById(int id);

    List<AnswerEntity> getAllAnswers();

    int addAnswer(AnswerEntity anAnswer);

    boolean removeAnswer(int id);

}
