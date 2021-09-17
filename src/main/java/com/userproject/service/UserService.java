package com.userproject.service;

import com.userproject.model.User;

import java.util.List;

public interface UserService {

    User getById(int id);
    User getByEmail(String email);
    List<User> getAll();
    User Add(User user);
    void Update(int id,User user);


    void Delete(int id);

}
