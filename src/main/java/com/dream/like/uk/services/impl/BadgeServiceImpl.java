package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IBadgeDao;
import com.dream.like.uk.domain.entities.BadgeEntity;
import com.dream.like.uk.services.IBadgeService;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by natalia on 4/23/16.
 */
public class BadgeServiceImpl extends IDaoServiceImpl implements IBadgeService {

    @Autowired
    private IBadgeDao badgeDao;

    public BadgeEntity getById(int id) {
              return badgeDao.get(id);

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<BadgeEntity> getAllBadges() {
        return badgeDao.get();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addBadge(BadgeEntity aBadge) {
        if (aBadge != null) {
             badgeDao.update(aBadge);
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean removeBadge(int id) {
        return badgeDao.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public <T> Number count(Class<T> currentClass, Criterion... eq) {
        return null;
    }
}
