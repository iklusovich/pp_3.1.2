package org.example.boot2.service;


import org.example.boot2.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    void add(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User showUser(int id);
}
