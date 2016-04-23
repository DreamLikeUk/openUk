package com.dream.like.uk.domain.entities;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

/**
 * Created by Stacy on 4/23/16.
 */
@Table(name = "badges")
@Entity
public class BadgeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @NotBlank()
    @Length(max = 45)
    @Column(name = "name")
    private String name;
    @NotBlank
    @Column(name = "badge_link")
    private String link;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category", nullable = false)
    private CategoryEntity category;

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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BadgeEntity)) return false;

        BadgeEntity that = (BadgeEntity) o;

        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (!link.equals(that.link)) return false;
        if (!name.equals(that.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + name.hashCode();
        result = 31 * result + link.hashCode();
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }

    public BadgeEntity() {
    }

    public BadgeEntity(String name, String link, CategoryEntity category) {
        this.name = name;
        this.link = link;
        this.category = category;
    }

    @Override
    public String toString() {
        return "BadgeEntity{" +
                "id=" + id +

                ", name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", category=" + category +
                '}';
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;

    }
}
