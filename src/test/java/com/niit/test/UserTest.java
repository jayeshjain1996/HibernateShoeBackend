package com.niit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.AppConfig.AppConfig;
import com.niit.model.User;
import com.niit.service.UserService;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = AppConfig.class)
public class UserTest 
{
	@Autowired
	UserService userService;
	
	@Test
	@Ignore
	public void addUser()
	{
		User u=new User();
		u.setUsername("monil");
		u.setEmail("monil7@gamil.com");
		u.setPassword("pass@789");
		
		assertEquals(true, userService.addUser(u));
	}

	@Test
	@Ignore
	public void deleteUser()
	{
		assertEquals(true,userService.deleteUser(2));
	}
	
	@Test
	@Ignore
	public void updateUser()
	{
	  User u=new User();
	  u.setUserid(1);
	  u.setUsername("jayesh");
	  u.setEmail("jayeshjain1996@gmail.com");
	  u.setPassword("pass@123");
	  
	  assertEquals(true,userService.updateUser(u));
	}
	
	@Test
	public void displayAll()
	{
	  assertNotNull(userService.displayAll());
	}
	
	@Test
	public void displayByUserid()
	{
		assertNotNull(userService.displayByUserid(3));
	}
}
