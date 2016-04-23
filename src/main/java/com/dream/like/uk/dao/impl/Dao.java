package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.IDao;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.persistence.TransactionRequiredException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Stacy on 4/23/16.
 */
@Repository
public class Dao implements IDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public <T> List<T> get(Class<T> tClass) {
        validateTransaction();
        String fullClassName = tClass.getName();
        fullClassName = fullClassName.substring(fullClassName.lastIndexOf(".")+1, fullClassName.length());
        return getSession().createQuery("from "+fullClassName).list();
    }

    @Override
    public <T> List<T> get(Class<T> tClass, int offset, int limit) {
        validateTransaction();
        Criteria criteria = getSession().createCriteria(tClass);
        criteria.setFirstResult(offset);
        criteria.setMaxResults(limit);
        return criteria.list();
    }

    @Override
    public <T> T get(Class<T> tClass, int id) {
        validateTransaction();
        return (T) getSession().get(tClass, id);
    }

    @Override
    public <T> List<T> get(Class<T> entityClass, Collection<Criterion> restrictions) {
        validateTransaction();
        return get(entityClass, restrictions.toArray((new Criterion[0])));
    }

    @Override
    public <T> List<T> get(Class<T> entityClass, Criterion... restrictions) {
        validateTransaction();
        return get(entityClass, 0, 0, restrictions);
    }

    @Override
    public <T> List<T> get(Class<T> entityClass, int from, int to, Collection<Criterion> restrictions) {
        validateTransaction();
        return get(entityClass, from, to, restrictions.toArray((new Criterion[0])));
    }

    @Override
    public <T> List<T> get(Class<T> entityClass, int from, int to, Criterion... restrictions) {
        validateTransaction();
        Criteria criteria = getSession().createCriteria(entityClass);
        criteria.setFirstResult(from);
        if (to != 0)
            criteria.setMaxResults(to);
        for (Criterion restriction : restrictions)
            criteria.add(restriction);
        return criteria.list();
    }

    @Override
    public <T> List<T> get(Class<T> ent, String entityClass, int offset, int limit, HashMap<String, FetchMode> fetchMode, HashMap<String, String> alias, Collection<Criterion> criterions) {
        validateTransaction();
        return get(ent, entityClass, offset, limit, fetchMode, alias, criterions.toArray((new Criterion[0])));
    }

    @Override
    public <T> List<T> get(Class<T> ccl, String entityClass, int offset, int limit, HashMap<String, FetchMode> fetchMode, HashMap<String, String> alias, Criterion... criterions) {
        validateTransaction();
        Criteria criteria = getSession().createCriteria(ccl, entityClass);
        criteria.setFirstResult(offset);
        if (limit != 0)
            criteria.setMaxResults(limit);
        for (Criterion restriction : criterions)
            criteria.add(restriction);
        for (Map.Entry<String, FetchMode> stringObjectEntry : fetchMode.entrySet()) {
            criteria.setFetchMode(stringObjectEntry.getKey(), stringObjectEntry.getValue());
        }
        for (Map.Entry<String, String> stringObjectEntry : alias.entrySet()) {
            criteria.createAlias(stringObjectEntry.getKey(), stringObjectEntry.getValue());
        }
        return criteria.list();
    }


    @Override
    public <T> int save(T entity) {
        validateTransaction();
        return (Integer) getSession().save(entity);
    }

    @Override
    public <T> boolean delete(Class<T> tClass, int id) {
        validateTransaction();
        T toDelete = get(tClass, id);
        getSession().delete(toDelete);
        return true;
    }
    @Override
    public <T> T attachWithMerge(T object) {
        validateTransaction();
        return (T) getSession().merge(object);
    }

    @Override
    public <T> Number count(Class<T> currentClass, Criterion... restrictions) {
        validateTransaction();
        Criteria criteria = getSession().createCriteria(currentClass);
        criteria.setProjection(Projections.rowCount());
        for (Criterion restriction : restrictions)
            criteria.add(restriction);
        return ((Number)criteria.uniqueResult());
    }

    @Override
    public <T> Number count(Class<T> currentClass, Collection<Criterion> restrictions) {
        validateTransaction();
        return count(currentClass, restrictions.toArray(new Criterion[0]));
    }

    private void validateTransaction(){
        if(!TransactionSynchronizationManager.isActualTransactionActive()){
            throw new TransactionRequiredException();
        }
    }

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
