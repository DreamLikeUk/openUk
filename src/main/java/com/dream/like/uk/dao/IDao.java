package com.dream.like.uk.dao;

import org.hibernate.FetchMode;
import org.hibernate.criterion.Criterion;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Stacy on 4/23/16.
 */
public interface IDao {

    <T> List<T> get(Class<T> tClass);

    <T>List<T> get(Class<T> tClass, int offset, int limit);

    <T>T get(Class<T> tClass, int id);

    <T>List<T> get(Class<T> entityClass, Collection<Criterion> restrictions);
    <T>List<T> get(Class<T> entityClass, Criterion... restrictions);

    <T>List<T> get(Class<T> entityClass, int from, int to, Collection<Criterion> restrictions);
    <T>List<T> get(Class<T> entityClass, int from, int to, Criterion... restrictions);

    <T>List<T> get(Class<T> bookKeywordEntityClass,
                                         String entityClass,
                                         int offset,
                                         int limit,
                                         HashMap<String, FetchMode> fetchMode,
                                         HashMap<String, String> alias,
                                         Collection<Criterion> criterions);

    <T>List<T> get(Class<T> bookKeywordEntityClass,
                                         String entityClass,
                                         int offset,
                                         int limit,
                                         HashMap<String, FetchMode> fetchMode,
                                         HashMap<String, String> alias,
                                         Criterion... criterions);

    <T>int save(T entity);

    <T>boolean delete(Class<T> tClass, int id);


    <T>T attachWithMerge(T object);

    <T>Number count(Class<T> currentClass, Criterion... eq);

    <T>Number count(Class<T> currentClass, Collection<Criterion> eq);

}
