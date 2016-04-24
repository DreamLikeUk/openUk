package com.dream.like.uk.controllers;

import com.dream.like.uk.domain.entities.UserEntity;
import com.dream.like.uk.domain.response.AjaxResponseBody;
import com.dream.like.uk.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stacy on 4/23/16.
*/
@RestController
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AjaxResponseBody<UserEntity> getCategories(){
        AjaxResponseBody<UserEntity> responseBody = new AjaxResponseBody<UserEntity>();
           List<UserEntity> cat = new ArrayList<UserEntity>();
         cat.add(userService.getUserById(1));
        responseBody.setResult(cat);
        responseBody.setCode("204");
        return responseBody;
    }
}
