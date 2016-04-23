package com.dream.like.uk.dao;

import com.dream.like.uk.domain.entities.CategoryEntity;

/**
 * Created by Stacy on 4/23/16.
 */
public interface ICategoryDao {

    /**
     * Returns category
     * @param id
     * @return
     */
    CategoryEntity getById(int id);
}
