package com.lets.apis.test.controller;

import com.lets.apis.client.generator.model.UserResponse;
import com.lets.apis.test.services.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService userService;

    @GetMapping("/user")
    public ResponseEntity<UserResponse> getUser(@RequestParam String username) {
        UserResponse user = userService.getUser(username);
        return ResponseEntity.ok(user);
    }
}