package com.dream.like.uk.services;

import com.dream.like.uk.dao.ICategoryDao;
import com.dream.like.uk.domain.entities.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by natalia on 4/23/16.
 */
public interface ICategoryService {


     CategoryEntity getById(int id);
     List<CategoryEntity> getAllCategories();

    }
