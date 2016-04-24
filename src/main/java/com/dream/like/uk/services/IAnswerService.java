package com.dream.like.uk.services;

import com.dream.like.uk.domain.entities.AnswerEntity;
import com.dream.like.uk.domain.entities.BadgeEntity;
import org.hibernate.criterion.Criterion;

import java.util.List;
import java.util.Map;

/**
 * Created by natalia on 4/23/16.
 */
public interface IAnswerService {

    AnswerEntity getById(int id);

    List<Map<String,Object>> getAllAnswers();

    int addAnswer(AnswerEntity anAnswer);

    boolean removeAnswer(int id);


    List<Map<String,Object>> getAnswersByQuestion(int id);
    }



