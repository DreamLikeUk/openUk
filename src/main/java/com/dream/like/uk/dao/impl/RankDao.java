package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.IRankDao;
import com.dream.like.uk.domain.entities.RankEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by Stacy on 4/23/16.
 */
@Repository
public class RankDao extends BaseDao<RankEntity>implements IRankDao {
    @Override
    protected Class<RankEntity> getCurrentClass() {
        return RankEntity.class;
    }
    @Override
    public RankEntity getById(int id) {
        return get(id);
    }
}
