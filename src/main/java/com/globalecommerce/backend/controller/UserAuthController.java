package com.globalecommerce.backend.controller;

import com.globalecommerce.backend.entity.UserAuth;
import com.globalecommerce.backend.service.UserAuthService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User Authentication Management Controller
 */
@Api(tags = "UserAuthController", description = "User Authentication Management")
@RestController
@RequestMapping("/users")
public class UserAuthController {

    @Autowired
    private UserAuthService userAuthService;

    @ApiOperation("Get all users")
    @GetMapping
    public ResponseEntity<List<UserAuth>> getAllUsers() {
        List<UserAuth> userList = userAuthService.getAllUsers();
        return ResponseEntity.ok(userList);
    }

    @ApiOperation("Create a new user")
    @PostMapping
    public ResponseEntity<UserAuth> createUser(@RequestBody UserAuth userAuth) {
        UserAuth createdUser = userAuthService.createUser(userAuth);
        return ResponseEntity.ok(createdUser);
    }

    @ApiOperation("Get user by ID")
    @GetMapping("/{id}")
    public ResponseEntity<UserAuth> getUserById(@PathVariable Long id) {
        UserAuth user = userAuthService.getUserById(id);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @ApiOperation("Update user by ID")
    @PutMapping("/{id}")
    public ResponseEntity<UserAuth> updateUser(@PathVariable Long id, @RequestBody UserAuth userAuth) {
        UserAuth updatedUser = userAuthService.updateUser(id, userAuth);
        return ResponseEntity.ok(updatedUser);
    }

}

