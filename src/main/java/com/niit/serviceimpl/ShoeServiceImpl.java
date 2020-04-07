package com.niit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.ShoeDao;
import com.niit.model.Shoe;
import com.niit.service.ShoeService;

@Service
public class ShoeServiceImpl implements ShoeService
{
  @Autowired
  ShoeDao shoeDAO;

@Override
public boolean addShoe(Shoe s)
{
	shoeDAO.addShoe(s);
	return true;
}

@Override
public boolean deleteShoe(int shoeid)
{
  shoeDAO.deleteShoe(shoeid);
  return true;
}

@Override
public boolean updateShoe(Shoe s) 
{
  shoeDAO.updateShoe(s);
  return true;
}

@Override
public List<Shoe> displayAll() 
{
 return shoeDAO.displayAll();
}

@Override
public Shoe displayByShoeid(int shoeid) 
{
 return shoeDAO.displayByShoeid(shoeid);
}
  
}
