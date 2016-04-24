package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.ICategoryDao;
import com.dream.like.uk.domain.entities.CategoryEntity;
import com.dream.like.uk.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;


/**
 * Created by natalia on 4/23/16.
 */
@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryDao categoryDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public CategoryEntity getById(int id) {
       return categoryDao.get(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map<String,Object>> getAllCategories() {
        List<Map<String, Object>> categories = new ArrayList<Map<String, Object>>();
        for(CategoryEntity cat: categoryDao.get())
        categories.add(convert(cat));
       return categories;
    }

    @Override
    public int saveCaregory(CategoryEntity aCategory) {
        return 0;
    }

    @Override
    public boolean removeCategory(int id) {
        return false;
    }

    private Map<String, Object> convert(CategoryEntity categoryEntity){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name",categoryEntity.getName());
        map.put("description", categoryEntity.getDescription());
        map.put("link", categoryEntity.getLink());
        return map;
    }


}
