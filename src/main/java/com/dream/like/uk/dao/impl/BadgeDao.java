package com.dream.like.uk.dao.impl;

import com.dream.like.uk.dao.IBadgeDao;
import com.dream.like.uk.domain.entities.BadgeEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Stacy on 4/23/16.
 */
@Repository
public class BadgeDao extends BaseDao<BadgeEntity> implements IBadgeDao {
    @Override
    protected Class<BadgeEntity> getCurrentClass() {
        return BadgeEntity.class;
    }
}
