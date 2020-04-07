package com.niit.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDao;
import com.niit.model.User;

@Repository(value = "userDAO")
@Transactional
public class UserDaoImpl implements UserDao
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addUser(User u)
	{
		sessionFactory.getCurrentSession().save(u);
		return true;
	}

	@Override
	public boolean deleteUser(int userid)
	{
	  User u=new User();
	  u.setUserid(userid);
	  sessionFactory.getCurrentSession().delete(u);
	  return true;
	}

	@Override
	public boolean updateUser(User u) 
	{
	  sessionFactory.getCurrentSession().update(u);
	  return true;
	}

	@Override
	public List<User> displayAll()
	{
	  return sessionFactory.getCurrentSession().createQuery("from com.niit.model.User").list();
	}

	@Override
	public User displayByUserid(int userid)
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from com.niit.model.User where userid=:userid");
		return (User)query.setParameter("userid",userid).getResultList().get(0);
	}

	@Override
	public User displayByUsername(String username)
	{
	  Query query=sessionFactory.getCurrentSession().createQuery("from com.niit.model.User where username=:name");
	  return (User)query.setParameter("name",username).getResultList().get(0);
	}

}
