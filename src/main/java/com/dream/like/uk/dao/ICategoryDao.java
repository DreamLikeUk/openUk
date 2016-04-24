package com.dream.like.uk.dao;

import com.dream.like.uk.domain.entities.CategoryEntity;

import java.util.List;

/**
 * Created by Stacy on 4/23/16.
 *
 */
public interface ICategoryDao {

    List<CategoryEntity> get();
    CategoryEntity get(Integer id);

    /**
     * works for update and save
     * @param categoryEntity
     * @return
     */
    CategoryEntity update(CategoryEntity categoryEntity);

    boolean delete(int id);

}
