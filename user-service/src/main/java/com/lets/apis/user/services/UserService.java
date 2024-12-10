package com.lets.apis.user.services;

import com.lets.apis.user.dao.UserDao;
import com.lets.apis.user.dao.model.User;
import com.lets.apis.user.model.UserResponse;
import com.lets.apis.user.mapper.UserMapper;
import com.lets.apis.user.model.CreateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDao userDao;

    public void createUser(CreateUserRequest createUser) {
        final User user = UserMapper.toEntity(createUser);
        userDao.save(user);
    }

    public UserResponse getUser(String username) {
        User user = userDao.get(username);
        return UserMapper.toResponse(user);
    }
}
