package com.lets.apis.user.dao;

import com.lets.apis.user.dao.model.User;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

import static org.springframework.util.CollectionUtils.isEmpty;

@Component
public class UserDao {

    private static Set<User> users = new HashSet<>();

    public User save(User user) {
        users.add(user);
        return user;
    }

    public User get(String name) {
        return getUsers().stream()
                .filter(e -> e.getUsername().equals(name))
                .findAny()
                .orElse(null);
    }

    private static Set<User> getUsers() {
        if (isEmpty(users)) {
            users.add(User.builder()
                    .name("ahmet")
                    .surname("hamdi")
                    .username("ahmethamdi")
                    .build());
        }
        return users;
    }
}