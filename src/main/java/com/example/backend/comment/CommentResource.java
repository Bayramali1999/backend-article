package com.example.backend.comment;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentResource {

    private final CommentService commentService;

    public CommentResource(CommentService commentService) {
        this.commentService = commentService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Commentaries>> findAllComments() {
        return new ResponseEntity<>(commentService.findAllComment(), HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<Commentaries> addComment(@RequestBody Commentaries commentaries) {
        Commentaries commentaries1 = commentService.addComment(commentaries);
        return new ResponseEntity<>(commentaries1, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Commentaries> updateComment(@RequestBody Commentaries comment) {
        Commentaries commentaries = commentService.updateComment(comment);
        return new ResponseEntity<>(commentaries, HttpStatus.OK);
    }

    @GetMapping("/commentinartc/{code}")
    public ResponseEntity<List<Commentaries>> findCommentsByArticleCode(@PathVariable("code") String code) {
        List<Commentaries> commentaries = commentService.findCommentsByCode(code);
        return new ResponseEntity<>(commentaries, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable("id") Long id) {
        commentService.deleteComment(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
