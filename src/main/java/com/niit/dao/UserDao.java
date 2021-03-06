package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface UserDao
{
  public boolean addUser(User u);
  public boolean deleteUser(int userid);
  public boolean updateUser(User u);
  public List<User> displayAll();
  public User displayByUserid(int userid);
  public User displayByUsername(String username);
}
