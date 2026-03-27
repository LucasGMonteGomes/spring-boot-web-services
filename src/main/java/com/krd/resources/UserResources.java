package com.krd.resources;

import com.krd.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findall() {
       User u = new User(1L, "Lucas", "lucas@gmail.com", "(31)99553-3117", "12345");
        return ResponseEntity.ok().body(u);
    }
}
