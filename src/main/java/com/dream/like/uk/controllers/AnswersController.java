package com.dream.like.uk.controllers;

import com.dream.like.uk.domain.response.AjaxResponseBody;
import com.dream.like.uk.services.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by Stacy on 4/23/16.
 */
@Controller
@RequestMapping("/answer")
public class AnswersController {
@Autowired
private IAnswerService answerService;
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AjaxResponseBody<Map<String,Object>> getQuestionsForUser(@RequestParam("question") int id){
        AjaxResponseBody<Map<String,Object>> responseBody = new AjaxResponseBody<Map<String,Object>>();
        List<Map<String,Object>> map = answerService.getAnswersByQuestion(id);
        responseBody.setResult(answerService.getAnswersByQuestion(id));
        responseBody.setCode("204");
        return responseBody;
    }
}
