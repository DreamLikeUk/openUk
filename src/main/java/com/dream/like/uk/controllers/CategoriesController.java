package com.dream.like.uk.controllers;

import com.dream.like.uk.dao.ICategoryDao;
import com.dream.like.uk.domain.Category;
import com.dream.like.uk.domain.entities.CategoryEntity;
import com.dream.like.uk.domain.response.AjaxResponseBody;
import com.dream.like.uk.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by Stacy on 4/23/16.
 */
@RestController
@RequestMapping("/category")
public class CategoriesController {
    @Autowired
    private ICategoryService categoryService;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AjaxResponseBody<Map<String,Object>> getCategories(){
        AjaxResponseBody<Map<String,Object>> responseBody = new AjaxResponseBody<Map<String,Object>>();
        responseBody.setResult(categoryService.getAllCategories());
        responseBody.setCode("204");
        return responseBody;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AjaxResponseBody<Map<String,Object>> getCategory(@PathVariable("id") int id){
        AjaxResponseBody<Map<String,Object>> responseBody = new AjaxResponseBody<Map<String,Object>>();
        List<Map<String,Object>> cat = new ArrayList<Map<String,Object>>();
        cat.add(categoryService.getCategory(id));
        responseBody.setResult(cat);
        responseBody.setCode("204");
        return responseBody;
    }
    @RequestMapping(value = "/", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean putCategories(@RequestBody Category category){
        return categoryService.putCategory(category)!=-1;
    }
}
