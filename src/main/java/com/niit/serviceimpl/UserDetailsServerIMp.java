package com.niit.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.User;
import com.niit.service.UserService;

@Service("userDetailsService")
public class UserDetailsServerIMp implements UserDetailsService
{
	@Autowired
	UserService userService;

    @Transactional(readOnly = true)
	public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
    {
	    User user1 =  userService.displayByUsername(username);
	    UserBuilder builder = null;
	    if (user1 != null) 
	    {
	      builder = org.springframework.security.core.userdetails.User.withUsername(username);
	      builder.disabled(!user1.isStatus());
	      builder.password(user1.getPassword());
	      String[] authorities = new String[]{user1.getAuthority()} ;

	      builder.authorities(authorities);
	    } else {
	      throw new UsernameNotFoundException("User not found.");
	    }
	    return builder.build();
	  }
}