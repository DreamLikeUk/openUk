package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IRoleDao;
import com.dream.like.uk.dao.IUserDao;
import com.dream.like.uk.domain.User;
import com.dream.like.uk.domain.entities.AnswerEntity;
import com.dream.like.uk.domain.entities.QuestionEntity;
import com.dream.like.uk.domain.entities.UserEntity;
import com.dream.like.uk.domain.enums.RoleEnum;
import com.dream.like.uk.services.IRankService;
import com.dream.like.uk.services.IRoleService;
import com.dream.like.uk.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stacy on 4/7/16.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Autowired
    private IRoleService roleService;
    @Autowired
    private IRankService rankService;
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserEntity getUserById(int userId) {
        return userDao.get(userId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserEntity getUserByMail(String mail) {
        return userDao.getUserByMail(mail);
    }

    @Override
    public Map<String, Object> getUser(int id) {
        return convert(getUserById(id));
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserEntity updateUser(UserEntity user) {
        if (user != null) {
            return userDao.update(user);
        } else {
            return null;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteUser(int userId) {
        return userDao.delete(userId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
        public RoleEnum getUserRole(UserEntity userEntity) {
        return null;
    }

    @Override
    public boolean saveUser(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(user.getEmail());
        userEntity.setActive(true);
        userEntity.setPassword(user.getPassword());
        userEntity.setUsername(user.getName());
        userEntity.setRoleEntity(roleService.getRole(3));
        userEntity.setRankEntity(rankService.getRankById(1));
        return updateUser(userEntity)!=null;
    }
    private Map<String, Object> convert(UserEntity categoryEntity){
        Map<String, Object> map = new HashMap<>();
        map.put("id",categoryEntity.getId());
        map.put("name",categoryEntity.getUsername());
        map.put("email", categoryEntity.getEmail());
        map.put("rank", categoryEntity.getRankEntity().getName());
        return map;
    }



}
