package com.dream.like.uk.dao;

import com.dream.like.uk.domain.entities.RankEntity;

import java.util.List;

/**
 * Created by Stacy on 4/23/16.
 */
public interface IRankDao {
    List<RankEntity> get();
    RankEntity get(Integer id);
    RankEntity update(RankEntity rankEntity);
    boolean delete(int id);
}
