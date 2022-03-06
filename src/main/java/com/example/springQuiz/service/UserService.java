package com.example.springQuiz.service;

import java.util.Set;

import com.example.springQuiz.model.User;
import com.example.springQuiz.model.UserRole;

public interface UserService {

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    public User getUser(String username);

    //delete user by id
    public void deleteUser(Long userId);

}
