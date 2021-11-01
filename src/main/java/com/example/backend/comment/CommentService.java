package com.example.backend.comment;


import com.example.backend.error.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CommentService {
    private final CommentRepo commentRepo;

    @Autowired
    public CommentService(CommentRepo employeeRepo) {
        this.commentRepo = employeeRepo;
    }

    public Commentaries addComment(Commentaries commentaries) {
        return commentRepo.save(commentaries);
    }

    public List<Commentaries> findAllComment() {
        return commentRepo.findAll();
    }


    public Commentaries updateComment(Commentaries commentaries) {
        return commentRepo.save(commentaries);
    }

    public List<Commentaries> findCommentsByCode(String code) {
        return commentRepo.findCommentariesByArticleCode(code)
                .orElseThrow(() -> new NotFoundException("User by id " + code + " was not found"));
    }

    public void deleteComment(Long id) {
        commentRepo.removeCommentById(id);
    }

}
