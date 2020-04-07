package com.niit.dao;

import java.util.List;

import com.niit.model.Shoe;

public interface ShoeDao
{
 public boolean addShoe(Shoe s);
 public boolean deleteShoe(int shoeid);
 public boolean updateShoe(Shoe s);
 public List<Shoe> displayAll();
 public Shoe displayByShoeid(int shoeid);
}
