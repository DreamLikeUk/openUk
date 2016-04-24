package com.dream.like.uk.services;

import org.hibernate.criterion.Criterion;

/**
 * Created by natalia on 4/24/16.
 */
public interface IDaoService {

    <T>T get(Class<T> tClass, int id);
    <T>int save(T entity);

    <T>boolean delete(Class<T> tClass, int id);
    <T>Number count(Class<T> currentClass, Criterion... eq);

}
