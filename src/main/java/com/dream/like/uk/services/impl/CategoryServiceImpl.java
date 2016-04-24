package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.ICategoryDao;
import com.dream.like.uk.domain.entities.CategoryEntity;
import com.dream.like.uk.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by natalia on 4/23/16.
 */
@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryDao categoryDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CategoryEntity getById(int id) {
        return categoryDao.getById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    List<CategoryEntity> getAllCategories() {
       return null
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int saveCaregory(CategoryEntity aCategory) {
        return -1;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean removeCategory(CategoryEntity aCategory, int id) {
        return false;
    }

    }
