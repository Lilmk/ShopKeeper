package com.liljava.store.inventory;

import java.util.Random;

public class Rating {

	Random generator = new Random();
	

	public static Rating Toothpick_Rating = new Rating();
	public static Rating Cottonball_Rating = new Rating();
	public static Rating Pencil_Rating = new Rating();
	public static Rating Pen_Rating = new Rating();
	public static Rating Toothbrush_Rating = new Rating();
	
	public int setRating(){
		
		return generator.nextInt(11);
	}
}
