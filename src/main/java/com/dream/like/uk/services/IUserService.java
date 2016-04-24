package com.dream.like.uk.services;

import com.dream.like.uk.domain.User;
import com.dream.like.uk.domain.entities.AnswerEntity;
import com.dream.like.uk.domain.entities.UserEntity;
import com.dream.like.uk.domain.enums.RoleEnum;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.Map;

/**
 * Created by Stacy on 2/12/16.
 */
public interface IUserService {
    /**
     * Returns the user, which corresponds to given id
     * @param userId
     * @return
     */
    UserEntity getUserById(int userId);

    /**
     * Returns the user, which corresponds to given mail
     * @param mail
     * @return
     */
    UserEntity getUserByMail(String mail);

    Map<String,Object> getUser(int id);

    /**
     * Creates or updates the user
     * @param user
     * @return
     */
    UserEntity updateUser(UserEntity user);

    /**
     * Delete user, which corresponds to given id
     * @param userId
     * @return
     */
    boolean deleteUser(int userId);

    /**
     * Returns role of the given user
     * @param userEntity
     * @return
     */
    RoleEnum getUserRole(UserEntity userEntity);

    boolean saveUser(User user);

}
