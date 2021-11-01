package com.example.backend.user;

import com.example.backend.error.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<Users> findAllUser() {
        return userRepo.findAll();
    }

    public Users createUser(Users users) {
        users.setUserCode(UUID.randomUUID().toString());
        return userRepo.save(users);
    }

    public Users findUserByLogin(String login) {
        Users user = userRepo.findUserByLogin(login).orElseThrow(
                () -> new NotFoundException("this " + login + " not fount")
        );
        return user;
    }

    public void removeUserById(Long id) {
        userRepo.removeUserById(id);
    }
}

