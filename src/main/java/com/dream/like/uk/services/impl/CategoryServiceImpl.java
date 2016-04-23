package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.ICategoryDao;
import com.dream.like.uk.domain.entities.CategoryEntity;
import com.dream.like.uk.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by natalia on 4/23/16.
 */
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryDao categoryDao;

    public CategoryEntity getById(int id) {
        return categoryDao.getById(id);
    }


    List<CategoryEntity> getAllCategories() {
       return categoryDao.get();
    }

    }
