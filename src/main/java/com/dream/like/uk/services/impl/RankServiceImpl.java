package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IRankDao;
import com.dream.like.uk.domain.entities.CategoryEntity;
import com.dream.like.uk.domain.entities.RankEntity;
import com.dream.like.uk.services.IRankService;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by natalia on 4/23/16.
 */
public class RankServiceImpl  implements IRankService {

    @Autowired
    private IRankDao rankDao;


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public RankEntity getRankById(int id) {
        return rankDao.get(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Map<String, Object>> getAllRanks() {
        List<Map<String, Object>> ranks = new ArrayList<Map<String, Object>>();
        for (RankEntity rank : rankDao.get()) {
            ranks.add(convert(rank));
        }
        return ranks;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int addRank(RankEntity aRank) {
        if (aRank != null) {
             rankDao.update(aRank);
            return 0;
        } else {
            return -1;
        }
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public  boolean removeRank(int id) {
        return  rankDao.delete(id);
    }



    private Map<String, Object> convert(RankEntity rankEntity){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name",rankEntity.getName());
        map.put("points", rankEntity.getPoints());
        return map;
    }
}
