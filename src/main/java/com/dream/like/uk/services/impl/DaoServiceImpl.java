package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IDao;
import com.dream.like.uk.services.IDaoService;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by natalia on 4/24/16.
 */
public class DaoServiceImpl implements IDaoService {
    @Autowired
    private IDao dao;

    public <T>T get(Class<T> tClass, int id) {
       return dao.get(tClass, id);
    }

   public  <T> int save(T entity) {
       return dao.save(entity);
   }

    public <T>boolean delete(Class<T> tClass, int id) {
        return dao.delete(tClass, id);
    }

    public <T>Number count(Class<T> currentClass, Criterion... eq) {
        return dao.count(currentClass, eq);
    }


}
