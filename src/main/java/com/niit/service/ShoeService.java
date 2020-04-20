package com.niit.service;

import java.util.List;

import com.niit.model.Shoe;

public interface ShoeService
{
	 public boolean addShoe(Shoe s);
	 public boolean deleteShoe(int shoeid);
	 public boolean updateShoe(Shoe s);
	 public List<Shoe> displayAll();
	 public Shoe displayByShoeid(int shoeid);
	 public List<Shoe> displayHighToLow();
	 public List<Shoe> displayLowToHigh();
	 public List<Shoe> displayBySearch(String search);
}
