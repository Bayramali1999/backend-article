package com.example.backend.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ArticleRepo extends JpaRepository<Article, Long>, JpaSpecificationExecutor<Article> {
    void removeArticleById(Long id);
}
