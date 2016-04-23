package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.ICategoryDao;
import com.dream.like.uk.domain.entities.CategoryEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by Stacy on 4/23/16.
 */
@Repository
public class CategoryDao extends BaseDao<CategoryEntity> implements ICategoryDao {
    @Override
    protected Class<CategoryEntity> getCurrentClass() {
        return CategoryEntity.class;
    }

    @Override
    public CategoryEntity getById(int id) {
        return get(id);
    }
}
