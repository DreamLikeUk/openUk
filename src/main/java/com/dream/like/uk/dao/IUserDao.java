package com.dream.like.uk.dao;

import com.dream.like.uk.domain.entities.UserEntity;
import com.dream.like.uk.domain.enums.RoleEnum;

import java.util.List;

/**
 * Created by Stacy on 4/8/16.
 */
public interface IUserDao {
    /**
     * Returns the user, which corresponds to given mail
     * @param mail
     * @return
     */
    UserEntity getUserByMail(String mail);
    List<UserEntity> get();
    UserEntity get(Integer id);
    UserEntity update(UserEntity userEntity);
    boolean delete(int id);

}
