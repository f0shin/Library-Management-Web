package com.library.service;

import org.springframework.stereotype.Service;

import com.library.model.User;
import com.library.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public void saveUser(User user) {
        userRepository.saveUser(user);
    }
}

