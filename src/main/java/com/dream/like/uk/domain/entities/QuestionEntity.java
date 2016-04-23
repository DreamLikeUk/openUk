package com.dream.like.uk.domain.entities;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Stacy on 4/23/16.
 */
@Entity
@Table(name = "questions")
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NotBlank
    @Length(max = 100)
    @Column(name = "text")
    private String text;

    @Column(name = "points")
    private int points;

    @NotBlank
    @Column(name = "image_link")
    private String link;

    @ManyToOne
    @JoinColumn(name = "id_category", referencedColumnName = "id")
    private CategoryEntity category;


    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Set<AnswerEntity> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getLink() {
        return link;
    }

    public Set<AnswerEntity> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<AnswerEntity> answers) {
        this.answers = answers;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuestionEntity)) return false;

        QuestionEntity that = (QuestionEntity) o;

        if (id != that.id) return false;
        if (points != that.points) return false;
        if (!link.equals(that.link)) return false;
        if (!text.equals(that.text)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + text.hashCode();
        result = 31 * result + points;
        result = 31 * result + link.hashCode();
        return result;
    }

    public QuestionEntity() {
    }

    public QuestionEntity(String text, int points, String link, CategoryEntity category) {
        this.text = text;
        this.points = points;
        this.link = link;
        this.category = category;
    }
}
