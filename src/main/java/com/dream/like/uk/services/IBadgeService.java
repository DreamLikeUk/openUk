package com.dream.like.uk.services;

import com.dream.like.uk.domain.entities.BadgeEntity;

import java.util.List;

/**
 * Created by natalia on 4/23/16.
 */
public interface IBadgeService extends IDaoService{

    BadgeEntity getById(int id);

    List<BadgeEntity> getAllBadges();

    int addBadge(BadgeEntity aBadge);

    boolean removeBadge(int id);

    }