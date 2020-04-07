package com.niit.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ShoeDao;
import com.niit.model.Shoe;

@Repository(value = "shoeDAO")
@Transactional
public class ShoeDaoImpl implements ShoeDao 
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addShoe(Shoe s)
	{
	  sessionFactory.getCurrentSession().save(s);
	  return true;
	}

	@Override
	public boolean deleteShoe(int shoeid)
	{
		Shoe s=new Shoe();
		s.setShoeid(shoeid);
	   sessionFactory.getCurrentSession().delete(s);
	   return true;
	}

	@Override
	public boolean updateShoe(Shoe s)
	{
		sessionFactory.getCurrentSession().update(s);
		return true;
  	}

	@Override
	public List<Shoe> displayAll()
	{
	  return sessionFactory.getCurrentSession().createQuery("from com.niit.model.Shoe").list();
	}

	@Override
	public Shoe displayByShoeid(int shoeid)
	{
	  Session session=sessionFactory.getCurrentSession();
	  Query query=session.createQuery("from com.niit.model.Shoe where shoeid=:shoeid");
	  return (Shoe)query.setParameter("shoeid",shoeid).getResultList().get(0);
	}
  
}
