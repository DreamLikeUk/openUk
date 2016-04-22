package com.dream.like.uk.domain.entities;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

/**
 * Created by Stacy on 4/23/16.
 */
@Table(name = "statuses")
@Entity
public class RankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @NotBlank()
    @Length(max = 45)
    @Column(name = "name")
    private String name;

    @Column(name = "points")
    private Integer points;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RankEntity)) return false;

        RankEntity that = (RankEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (points != null ? !points.equals(that.points) : that.points != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (points != null ? points.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RankEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", points=" + points +
                '}';
    }

    public RankEntity() {
    }

    public RankEntity(String name, Integer points) {
        this.name = name;
        this.points = points;
    }
}
