package com.liljava.store.inventory;

import java.util.Random;

public class Item {

	public String name;
	
	public double unitprice;
	
	public double totalprice;
	
	public int rating;
	
	public int quantity;
	
	
	public static Random generator = new Random();
	
	
	public Item(String name, double unitprice){
		
		this.name = name;
		this.unitprice = unitprice;
		this.rating = generator.nextInt(11);
		this.quantity = generator.nextInt(1001);
		this.totalprice = unitprice * quantity * rating / 10;
		}
	
	
	
	
	public String returnName(){
		return this.name;
	}
	
	public double returnUnitPrice(){
		return this.unitprice;
	}
	
	public double returnPrice(){
		return this.totalprice;
	}
	
	public int returnRating(){	
		return this.rating;
	}
	
	public int returnQuantity(){
		return this.quantity;
	}
	
	
	
}
