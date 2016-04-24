package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IBadgeDao;
import com.dream.like.uk.domain.entities.BadgeEntity;
import com.dream.like.uk.domain.entities.CategoryEntity;
import com.dream.like.uk.services.IBadgeService;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by natalia on 4/23/16.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BadgeServiceImpl implements IBadgeService {

    @Autowired
    private IBadgeDao badgeDao;

    public BadgeEntity getById(int id) {
              return badgeDao.get(id);

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map<String, Object>> getAllBadges() {
        List<Map<String, Object>> badges = new ArrayList<Map<String, Object>>();
        for (BadgeEntity badge : badgeDao.get()) {
            badges.add(convert(badge));
        }
        return badges;
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



    private Map<String, Object> convert(BadgeEntity badgeEntity){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name",badgeEntity.getName());
        map.put("badgeLink", badgeEntity.getLink());
        return map;
    }
}
