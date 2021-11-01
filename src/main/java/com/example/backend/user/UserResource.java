package com.example.backend.user;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }


//    @GetMapping("/all")
//    public ResponseEntity<List<Users>> findAllUser() {
//        return new ResponseEntity<>(userService.findAllUser(), HttpStatus.OK);
//    }

    @GetMapping("/login/{login}")
    public ResponseEntity<Users> getUserByLogin(@PathVariable("login") String login) {
        Users user = userService.findUserByLogin(login);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Users> createUser(@RequestBody Users users) {
        return new ResponseEntity<>(userService.createUser(users), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> removeUser(@PathVariable("id") Long id) {
        userService.removeUserById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
