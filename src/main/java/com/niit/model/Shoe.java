package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//this is the main model
@Entity
@Table(name = "shoes")
public class Shoe
{
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int shoeid;
   @Column
  private String shoebrand;
  private String shoemodel;
  private int shoesize;
  private String shoecolour;
  private float price;
public int getShoeid() {
	return shoeid;
}
public void setShoeid(int shoeid) {
	this.shoeid = shoeid;
}
public String getShoebrand() {
	return shoebrand;
}
public void setShoebrand(String shoebrand) {
	this.shoebrand = shoebrand;
}
public String getShoemodel() {
	return shoemodel;
}
public void setShoemodel(String shoemodel) {
	this.shoemodel = shoemodel;
}
public String getShoecolour() {
	return shoecolour;
}
public void setShoecolour(String shoecolour) {
	this.shoecolour = shoecolour;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getShoesize() {
	return shoesize;
}
public void setShoesize(int shoesize) {
	this.shoesize = shoesize;
}	
  
  

}
