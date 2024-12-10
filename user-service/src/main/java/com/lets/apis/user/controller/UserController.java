package com.lets.apis.user.controller;

import com.lets.apis.user.model.CreateUserRequest;
import com.lets.apis.user.model.UserResponse;
import com.lets.apis.user.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public void create(@RequestBody CreateUserRequest user) {
         userService.createUser(user);
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<UserResponse> getUser(@PathVariable("username") String username) {
        UserResponse user = userService.getUser(username);
        return ResponseEntity.ok(user);
    }
}