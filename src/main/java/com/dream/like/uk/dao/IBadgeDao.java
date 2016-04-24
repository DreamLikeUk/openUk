package com.dream.like.uk.dao;

import com.dream.like.uk.domain.entities.BadgeEntity;

import java.util.List;

/**
 * Created by Stacy on 4/23/16.
 */
public interface IBadgeDao {
    /**
     * Get all
     * @return
     */
    List<BadgeEntity> get();

    /**
     * get by id
     * @param id
     * @return
     */
    BadgeEntity get(Integer id);

    /**
     * update + save
     * @param answerEntity
     * @return
     */
    BadgeEntity update(BadgeEntity answerEntity);
    boolean delete(int id);
}
