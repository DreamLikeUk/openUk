package com.dream.like.uk.domain.entities;

import com.dream.like.uk.domain.entities.BadgeEntity;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

/**
 * Created by natalia on 4/23/16.
 */
@ContextConfiguration({ "classpath:application-context-test.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class AnswerDaoTest {

    @Test
    @Transactional
    @Rollback(true)
    public void testAddBadge() {
        BadgeEntity badge = new BadgeEntity();
        badge.setCategory("Фразеологія");
        badge.setName("Стріляний заєць");
        badge.setId(1);
        badge.setLink("");

        Assert.notNull("Badge category is not empty", badge.getCategory()));
        Assert.notNull("Badge name is not empty", badge.getName()));


    }
