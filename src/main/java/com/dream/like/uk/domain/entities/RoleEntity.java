package com.dream.like.uk.domain.entities;

import com.dream.like.uk.domain.enums.RoleEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stacy on 2/12/16.
 */
public class RoleEntity {
    private Integer id;
    private RoleEnum role;
    private List<PermissionEntity> permissions = new ArrayList<PermissionEntity>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public List<PermissionEntity> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionEntity> permissionEntities) {
        this.permissions = permissionEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleEntity that = (RoleEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (permissions != null ? !permissions.equals(that.permissions) : that.permissions != null) return false;

        return true;
    }

    public boolean equals(String o) {
        if (role != null ? !role.equals(o) : o != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (permissions != null ? permissions.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "id=" + id +
                ", name='" + role + '\'' +
                ", permissions=" + permissions +
                '}';
    }

}
