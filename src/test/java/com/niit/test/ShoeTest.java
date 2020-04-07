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
import com.niit.model.Shoe;
import com.niit.service.ShoeService;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = AppConfig.class)
public class ShoeTest 
{
	@Autowired 
	ShoeService shoeService;

      @Test
      @Ignore
	  public void addShoe()
	  {
		  Shoe s=new Shoe();
		  s.setShoebrand("Addidas");
		  s.setShoemodel("Runner 3");
		  s.setShoecolour("Blue");
		  s.setPrice(1999f);
		  
		  assertEquals(true,shoeService.addShoe(s));
	  }
      
      @Test
      @Ignore
      public void deleteShoe()
      {
    	 assertEquals(true,shoeService.deleteShoe(1));
      }
      
      @Test
      @Ignore
      public void updateShoe()
      {
    	  Shoe s=new Shoe();
    	  s.setShoebrand("Adidas");
    	  s.setShoecolour("orange");
    	  s.setShoeid(2);
    	  s.setShoemodel("Runner 3");
    	  s.setPrice(1999f);
    	  
    	  shoeService.updateShoe(s);
      }
      
      @Test
      public void displayAll()
      {
    	  assertNotNull(shoeService.displayAll());
      }
      
      @Test
      public void displayById()
      {
    	  assertNotNull(shoeService.displayByShoeid(2));
      }
}
