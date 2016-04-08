package com.dream.like.uk.domain.entities;

import com.dream.like.uk.domain.enums.PermissionEnum;

import javax.persistence.*;

/**
 * Created by Stacy on 2/12/16.
 */
@Entity
@Table(name = "permissions")
public class PermissionEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    @Column(name = "name")
    @Enumerated(EnumType.STRING)
    private PermissionEnum name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PermissionEnum getName() {
        return name;
    }

    public void setName(PermissionEnum name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PermissionEntity)) return false;

        PermissionEntity that = (PermissionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PermissionEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
