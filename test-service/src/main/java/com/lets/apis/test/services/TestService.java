package com.lets.apis.test.services;

import com.lets.apis.client.generator.controller.UserClient;
import com.lets.apis.client.generator.model.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    private final UserClient userClient;

    public UserResponse getUser(String username) {
        return userClient.getUser(username).getBody();
    }
}
