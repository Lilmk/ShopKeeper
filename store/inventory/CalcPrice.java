package com.liljava.store.inventory;

public class CalcPrice extends QuantityCounter{
	
	static double TOOTHPICK_PRICE = 1.50;
	static double COTTONBALL_PRICE = 0.50;
	static double PENCIL_PRICE = 2.50;
	static double PEN_PRICE = 3.00;
	static double TOOTHBRUSH_PRICE = 6.75;
	
	
	static CalcPrice Toothpick_Price = new CalcPrice();
	static CalcPrice Cottonball_Price = new CalcPrice();
	static CalcPrice Pencil_Price = new CalcPrice();
	static CalcPrice Pen_Price = new CalcPrice();
	static CalcPrice Toothbrush_Price = new CalcPrice();
	
	public static int TOOTHPICK_QUANTITY = Toothpick_Quantity.setQuantity();
	
	public static void main(String[] args){
		
		
		System.out.println(TOOTHPICK_QUANTITY);
	System.out.println(TOOTHPICK_PRICE * TOOTHPICK_QUANTITY * Toothbrush_Rating.setRating() / 10);	
		
	}
	
	
	
}
