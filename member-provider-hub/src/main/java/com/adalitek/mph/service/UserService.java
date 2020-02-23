package com.adalitek.mph.service;

import com.adalitek.mph.model.User;

public interface UserService {
  
 public User findUserByEmail(String email);
 
 public void saveUser(User user);
}