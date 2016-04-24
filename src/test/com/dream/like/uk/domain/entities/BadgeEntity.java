package com.dream.like.uk.domain.entities;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import javax.persistence.*;

/**
 * Created by natalia on 4/23/16.
 */

@ContextConfiguration({"classpath:application-context-test.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
class BadgeEntityTest {


    @Test
    public void createBadge() {
        CategoryEntity category  = new CategoryEntity();
        category.setId(1);
        category.setLink("www");
        category.setDescription("hello hello");
        category.setName("la-la-la");
        category.setQuestions(null);

        BadgeEntity badge = new BadgeEntity();
        badge.setId(2);
        badge.setName("a");
        badge.setCategory(category);


        Assert.notNull(category);
        Assert.notNull(badge);
        Assert.hasText(badge.getName());



    }
}