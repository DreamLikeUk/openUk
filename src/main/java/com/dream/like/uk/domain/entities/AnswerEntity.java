package com.dream.like.uk.domain.entities;

import javax.persistence.*;

/**
 * Created by Stacy on 4/23/16.
 */
@Table(name = "answers")
@Entity
public class AnswerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "text")
    private String text;
    @Column(name = "correct")
    private boolean correct;

    @ManyToOne
    @JoinColumn(name = "id_question", referencedColumnName = "id")
    private QuestionEntity question;
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

    @Override
    public String toString() {
        return "AnswerEntity{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", correct=" + correct +
                '}';
    }

    public AnswerEntity(String text, boolean correct) {
        this.text = text;
        this.correct = correct;
    }

    public AnswerEntity() {

    }

    public QuestionEntity getQuestion() {
        return question;
    }

    public void setQuestion(QuestionEntity question) {
        this.question = question;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnswerEntity)) return false;

        AnswerEntity that = (AnswerEntity) o;

        if (correct != that.correct) return false;
        if (id != that.id) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (correct ? 1 : 0);
        return result;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
