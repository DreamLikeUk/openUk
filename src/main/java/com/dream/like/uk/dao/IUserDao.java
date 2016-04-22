package com.dream.like.uk.dao;

import com.dream.like.uk.domain.entities.UserEntity;
import com.dream.like.uk.domain.enums.RoleEnum;

/**
 * Created by Stacy on 4/8/16.
 */
public interface IUserDao {
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

}