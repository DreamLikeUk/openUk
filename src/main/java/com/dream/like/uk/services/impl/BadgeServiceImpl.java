package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IBadgeDao;
import com.dream.like.uk.domain.entities.BadgeEntity;
import com.dream.like.uk.services.IBadgeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by natalia on 4/23/16.
 */
public class BadgeServiceImpl implements IBadgeService {

    @Autowired
    private IBadgeDao badgeDao;

    public BadgeEntity getById(int id) {
              return badgeDao.get(id);

    }

    @Override
    public List<BadgeEntity> getAllBadges() {
        return null;
    }

    @Override
    public int addBadge(BadgeEntity aBadge) {
        return 0;
    }

    @Override
    public boolean removeBadge(int id) {
        return false;
    }

}
