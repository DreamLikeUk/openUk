package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.IBadgeDao;
import com.dream.like.uk.domain.entities.BadgeEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by Stacy on 4/23/16.
 */
@Repository
public class BadgeDao extends BaseDao<BadgeEntity> implements IBadgeDao {
    @Override
    protected Class<BadgeEntity> getCurrentClass() {
        return BadgeEntity.class;
    }
    @Override
    public BadgeEntity getById(int id) {
        return get(id);
    }
}
