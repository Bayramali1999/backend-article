package com.example.backend.comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface CommentRepo extends JpaRepository<Commentaries, Long>, JpaSpecificationExecutor<Commentaries> {

    void removeCommentById(Long id);

    Optional<List<Commentaries>> findCommentariesByArticleCode(String code);
}
