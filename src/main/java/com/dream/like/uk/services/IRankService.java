package com.dream.like.uk.services;

import com.dream.like.uk.domain.entities.RankEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by natalia on 4/23/16.
 */
public interface IRankService {

    RankEntity getRankById( int id);

    List<Map<String, Object>> getAllRanks();

    int addRank(RankEntity aRank);

    boolean removeRank(int id);
}

