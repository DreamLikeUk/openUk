package com.dream.like.uk.dao;

import com.dream.like.uk.dao.impl.UserDao;
import com.dream.like.uk.domain.User;
import com.dream.like.uk.domain.entities.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by natalia on 4/24/16.
 */

@ContextConfiguration({"classpath:application-context-test.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    @Transactional
    @Rollback(true)
    public void addUserTest() {
        UserEntity user = new UserEntity();
        user.setId(1);
        user.setEmail("natalia@gmail.com");
        user.setPassword("12345");
        userDao.create(user);

       List<UserEntity> usersList = userDao.get();
       Assert.notEmpty(usersList);



    }

    public void checkUsers() {
        UserEntity user = new UserEntity();
        user.setId(1);
        user.setEmail("natalia@gmail.com");
        user.setPassword("12345");
        userDao.create(user);

        List<UserEntity> usersList = userDao.get();
        Assert.notNull(usersList.get(0));

    }


}
