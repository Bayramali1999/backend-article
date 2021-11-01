package com.example.backend.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface UserRepo extends JpaRepository<Users, Long>, JpaSpecificationExecutor<Users> {

    Optional<Users> findUserByLogin(String login);

    void removeUserById(Long id);
}
