package com.niit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.niit.dao.UserDao;
import com.niit.model.User;
import com.niit.others.Email;
import com.niit.service.UserService;

@Service
public class UserServiceImpl implements UserService
{
  @Autowired
  UserDao userDAO;

@Override
public boolean addUser(User u)
{
  u.setAuthority("user");
  u.setStatus(true);
  u.setPassword(new BCryptPasswordEncoder().encode(u.getPassword()));
  userDAO.addUser(u);
  Email email=new Email(u.getEmail(),"Spring Project","Welcome to Shoe online portal!!");
  email.sendEmail();
  return true;
}

@Override
public boolean deleteUser(int userid)
{
  userDAO.deleteUser(userid);
  return true;
}

@Override
public boolean updateUser(User u)
{
	userDAO.updateUser(u);
	return true;
}

@Override
public List<User> displayAll()
{
  return userDAO.displayAll();
}

@Override
public User displayByUserid(int userid)
{
  return userDAO.displayByUserid(userid);
}

@Override
public User displayByUsername(String username)
{
  return userDAO.displayByUsername(username);
}
  
}
