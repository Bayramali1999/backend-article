package com.example.backend.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ArticleService {
    private final ArticleRepo employeeRepo;

    @Autowired
    public ArticleService(ArticleRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Article addEmployee(Article employee) {
        employee.setCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Article> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Article updateEmployee(Article employee) {
        return employeeRepo.save(employee);
    }


    public void deleteEmployee(Long id) {
        employeeRepo.removeArticleById(id);
    }

}

