package com.example.backend.comment;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Commentaries implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String text;
    @Column(nullable = false, updatable = false)
    private String userName;
    @Column(nullable = false, updatable = false)
    private String userCode;
    @Column(nullable = false, updatable = false)
    private String articleCode;

    public Commentaries() {
    }

    public Commentaries(String text, String userName, String userCode, String articleCode) {
        this.text = text;
        this.userName = userName;
        this.userCode = userCode;
        this.articleCode = articleCode;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", userName='" + userName + '\'' +
                ", userCode='" + userCode + '\'' +
                ", articleCode='" + articleCode + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getArticleCode() {
        return articleCode;
    }

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }
}

