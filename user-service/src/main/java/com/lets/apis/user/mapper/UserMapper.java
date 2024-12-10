package com.lets.apis.user.mapper;

import com.lets.apis.user.dao.model.User;
import com.lets.apis.user.model.CreateUserRequest;
import com.lets.apis.user.model.UserResponse;

public class UserMapper {

    public static User toEntity(CreateUserRequest request) {
        return User.builder()
                .username(request.getUsername())
                .name(request.getName())
                .surname(request.getSurname())
                .build();
    }

    public static UserResponse toResponse(User user) {
        if (user == null) {
            throw new RuntimeException("User not found!");
        }
        return UserResponse.builder()
                .username(user.getUsername())
                .name(user.getName())
                .surname(user.getSurname())
                .build();
    }
}