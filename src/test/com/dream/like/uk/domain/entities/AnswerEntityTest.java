package com.dream.like.uk.domain.entities;

import javax.persistence.*;

/**
 * Created by Stacy on 4/23/16.
 */

@ContextConfiguration({ "classpath:application-context-test.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class AnswerEntityTest {


    @Test
    @Transactional
    @Rollback(true)
    public void testAddAnswer() {
        AnswerEntity answer = new AnswerEntity();
        answer.setQuestion("What is this?");
        answer.setText("This is project");
        answer.setCorrect(true);
        answer.setId(1);

        Assert.notNull("Answer text is not empty", answer.getText());
        Assert.notNull("Answer question is not empty", answer.getQuestion()));

    }
