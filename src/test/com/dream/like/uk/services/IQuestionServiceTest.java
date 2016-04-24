package com.dream.like.uk.services;

import com.dream.like.uk.dao.IQuestionDao;
import com.dream.like.uk.domain.entities.QuestionEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by natalia on 4/23/16.
 */

@ContextConfiguration({"classpath:application-context-test.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
 class IQuestionServiceTest {

    @Autowired
    private IQuestionDao questionDao;

    @Test
    public void checkQuestion() {

    }

}
