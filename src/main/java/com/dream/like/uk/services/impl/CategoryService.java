package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.ICategoryDao;
import com.dream.like.uk.domain.Category;
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
@Transactional(propagation = Propagation.REQUIRED)
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

    @Override
    public int putCategory(Category category) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setDescription(category.getDescription());
        categoryEntity.setName(category.getName());
        categoryEntity.setLink(category.getLink());
        categoryDao.update(categoryEntity);
        return 0;
    }

    @Override
    public Map<String, Object> getCategory(int id) {
        return convert(getById(id));
    }

    private Map<String, Object> convert(CategoryEntity categoryEntity){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id",categoryEntity.getId());
        map.put("name",categoryEntity.getName());
        map.put("description", categoryEntity.getDescription());
        map.put("link", categoryEntity.getLink());
        return map;
    }


}
