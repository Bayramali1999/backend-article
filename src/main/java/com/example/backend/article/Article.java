package com.example.backend.article;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String text;
    private String descr;
    private String userName;
    @Column(nullable = false, updatable = false)
    private String userCode;
    @Column(nullable = false, updatable = false)
    private String code;


    public Article() {
    }

    public Article(String text, String descr, String userName, String userCode, String code) {
        this.text = text;
        this.descr = descr;
        this.userName = userName;
        this.userCode = userCode;
        this.code = code;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", descr='" + descr + '\'' +
                ", userName='" + userName + '\'' +
                ", userCode='" + userCode + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

