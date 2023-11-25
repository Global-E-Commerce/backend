package com.globalecommerce.backend.controller;

import com.globalecommerce.backend.entity.UserAuth;
import com.globalecommerce.backend.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserAuthController {

    @Autowired
    private UserAuthService userAuthService;

    @PostMapping
    public ResponseEntity<UserAuth> createUser(@RequestBody UserAuth userAuth) {
        UserAuth createdUser = userAuthService.createUser(userAuth);
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserAuth> getUserById(@PathVariable Long id) {
        UserAuth user = userAuthService.getUserById(id);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<UserAuth>> getAllUsers() {
        List<UserAuth> users = userAuthService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserAuth> updateUser(@PathVariable Long id, @RequestBody UserAuth userAuth) {
        UserAuth updatedUser = userAuthService.updateUser(id, userAuth);
        return ResponseEntity.ok(updatedUser);
    }

}
