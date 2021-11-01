package com.example.backend.article;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/article")
public class ArticleRecourse {

    private final ArticleService articleService;

    public ArticleRecourse(ArticleService employeeService) {
        this.articleService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Article>> getAllEmployees() {
        List<Article> employees = articleService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Article> addEmployee(@RequestBody Article employee) {
        Article article = articleService.addEmployee(employee);
        article.setCode(UUID.randomUUID().toString());
        return new ResponseEntity<>(article, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Article> updateEmployee(@RequestBody Article employee) {
        Article updateEmployee = articleService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        articleService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
