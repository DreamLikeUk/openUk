package com.dream.like.uk.controllers;

import com.dream.like.uk.domain.entities.QuestionEntity;
import com.dream.like.uk.domain.response.AjaxResponseBody;
import com.dream.like.uk.services.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Stacy on 4/23/16.
 */
@RestController
@RequestMapping("/question")
public class QuestionsController {
@Autowired
private IQuestionService questionService;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AjaxResponseBody<Map<String,Object>> getQuestionsForUser(@RequestParam("user") int id, @RequestParam("category") int category){
        AjaxResponseBody<Map<String,Object>> responseBody = new AjaxResponseBody<Map<String,Object>>();
        responseBody.setResult(questionService.getQuestionsForUser(id,category));
        responseBody.setCode("204");
        return responseBody;
    }


}
