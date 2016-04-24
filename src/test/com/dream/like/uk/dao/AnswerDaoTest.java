package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.IAnswersDao;
import com.dream.like.uk.domain.entities.AnswerEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * Created by natalia on 4/23/16.
 */


@ContextConfiguration({ "classpath:application-context-test.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class LecturesDaoTest {
    @Autowired
    private IAnswersDao answersDao;

    @Test
    @Transactional
    @Rollback(true)
    public void testAddAnswer()
    {
        AnswerEntity answer = new AnswerEntity();
        answer.setId(1);
        answer.setQuestion("Do you know?");
        answer.setText("jdkhfb");
        answersDao.update(answer);

        List<AnswerEntity> answers = answersDao.get();
        Assert.notEmpty(answers);

    }
}


    }
}