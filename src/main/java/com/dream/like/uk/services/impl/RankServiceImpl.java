package com.dream.like.uk.services.impl;

import com.dream.like.uk.dao.IRankDao;
import com.dream.like.uk.domain.entities.RankEntity;
import com.dream.like.uk.services.IRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;

import javax.imageio.event.IIOReadProgressListener;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by natalia on 4/23/16.
 */
public class RankServiceImpl implements IRankService {

    @Autowired
    private IRankDao rankDao;


    @Override
    @org.springframework.transaction.annotation.Transactional(propagation = Propagation.REQUIRED)
   public RankEntity getRankById( int id) {
        return rankDao.getById(id);
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(propagation = Propagation.REQUIRED)
   public  List<RankEntity> getAllRanks() {
          return null
   }

    @Override
    @org.springframework.transaction.annotation.Transactional(propagation = Propagation.REQUIRED)
    public int addRank(RankEntity aRank) {

    }


    @Override
    @org.springframework.transaction.annotation.Transactional(propagation = Propagation.REQUIRED)
    public  boolean removeRank(RankEntity aRank, int id) {
        return  null
    }
}
