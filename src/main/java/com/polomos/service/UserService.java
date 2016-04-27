package com.polomos.service;

import java.util.List;

import com.polomos.dao.model.User;


public interface UserService {
    public List<User> getAllUsers();

    public void addUser(String user);

    public void deleteUser(String user);

    public void deleteAll();
}
