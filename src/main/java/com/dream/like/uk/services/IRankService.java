package com.dream.like.uk.services;

import com.dream.like.uk.domain.entities.RankEntity;

import java.util.List;

/**
 * Created by natalia on 4/23/16.
 */
public interface IRankService extends  IDaoService {

    RankEntity getRankById( int id);

    List<RankEntity> getAllRanks();

    int addRank(RankEntity aRank);

    boolean removeRank(int id);
}

