package com.dream.like.uk.domain.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Stacy on 4/23/16.
 */
@Table(name = "user_to_badges")
@Entity
public class UserBadgeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName="id")
    private UserEntity user;

    public BadgeEntity getBadge() {
        return badge;
    }

    public void setBadge(BadgeEntity badge) {
        this.badge = badge;
    }

    public UserEntity getUser() {
        return user;
    }

    public UserBadgeEntity() {
    }

    public UserBadgeEntity(UserEntity user, BadgeEntity badge) {
        this.user = user;
        this.badge = badge;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof UserBadgeEntity)) return false;

        UserBadgeEntity that = (UserBadgeEntity) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public void setUser(UserEntity user) {
        this.user = user;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_badge", referencedColumnName="id")
    private BadgeEntity badge;
}
