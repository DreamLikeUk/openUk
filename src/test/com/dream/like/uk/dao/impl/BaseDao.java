package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.IDao;
import com.dream.like.uk.domain.exceptions.NoSuchEntityException;
import com.google.common.collect.Lists;
import org.hibernate.FetchMode;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Stacy on 4/23/16.
 */
public abstract class BaseDao<T> {

    @Autowired
    private IDao dao;

    @Transactional(propagation = Propagation.REQUIRED)
    public T getNotNull(Integer id) throws NoSuchEntityException {
        return resultRequiredResolver(getDao().get(getCurrentClass(), id),
                String.format("id %d", id));
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public T get(Integer id) {
        try {
            return getNotNull(id);
        } catch (NoSuchEntityException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public List<T> get() {
        try {
            return getDao().get(getCurrentClass());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public List<T> get(int offset, int limit, Collection<Criterion> criterions) {
        return getDao().get(getCurrentClass(), offset, limit, criterions);
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public List<T> get(int offset, int limit, Criterion... criterions) {
        return getDao().get(getCurrentClass(), offset, limit, criterions);
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public List<T> get(Collection<Integer> books_id) {
        return getDao().get(getCurrentClass(), 0, 0,
                Lists.newArrayList(Restrictions.in("id", books_id)));
    }

    @Transactional(propagation = Propagation.REQUIRED)
    protected List<T> getByCriterions(Criterion... criterions) {
        return getDao().get(
                getCurrentClass(), criterions);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    protected List<T> getByCriterions(Collection<Criterion> criterions) {
        return getDao().get(
                getCurrentClass(), criterions);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    protected List<T> get(String book,
                          int i,
                          int i1,
                          HashMap<String, FetchMode> hashMap,
                          HashMap<String, String> ent,
                          Collection<Criterion> criterions) {
        return getDao().get(getCurrentClass(),
                book,
                i,
                i1,
                hashMap,
                ent,
                criterions
        );
    }

    @Transactional(propagation = Propagation.REQUIRED)
    protected List<T> get(String book,
                          HashMap<String, FetchMode> hashMap,
                          HashMap<String, String> ent,
                          Collection<Criterion> criterions) {
        return getDao().get(getCurrentClass(),
                book,
                0,
                0,
                hashMap,
                ent,
                criterions
        );
    }


    @Transactional(propagation = Propagation.REQUIRED)
    protected List<T> get(String book,
                          int i,
                          int i1,
                          HashMap<String, FetchMode> hashMap,
                          HashMap<String, String> ent,
                          Criterion... criterions) {
        return getDao().get(getCurrentClass(),
                book,
                i,
                i1,
                hashMap,
                ent,
                criterions
        );
    }


    @Transactional(propagation = Propagation.REQUIRED)
    protected List<T> get(String book,
                          HashMap<String, FetchMode> hashMap,
                          HashMap<String, String> ent,
                          Criterion... criterions) {
        return getDao().get(getCurrentClass(),
                book,
                0,
                0,
                hashMap,
                ent,
                criterions
        );
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer create(T entity) {
        return getDao().save(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public T update(T user) {
        return getDao().attachWithMerge(user);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public boolean delete(int id) {
        return getDao().delete(getCurrentClass(), id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Number count() {
        return getDao().count(getCurrentClass());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Number count(Criterion... eq) {
        return getDao().count(getCurrentClass(), eq);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Number count(Collection<Criterion> eq) {
        return getDao().count(getCurrentClass(), eq);
    }




    protected T resultRequiredResolver(T res, String message) throws NoSuchEntityException {
        if(res == null) {
            throw new NoSuchEntityException(getCurrentClass().getName(), message);
        } else {
            return res;
        }
    }



    protected IDao getDao(){
        return dao;
    }
    protected abstract Class<T> getCurrentClass();
}