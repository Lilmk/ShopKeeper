package com.liljava.store.inventory;

import java.util.Random;

public class QuantityCounter extends Rating{

	Random generator = new Random();
	
	static QuantityCounter Toothpick_Quantity = new QuantityCounter();
	static QuantityCounter Cottonball_Quantity = new QuantityCounter();
	static QuantityCounter Pencil_Quantity = new QuantityCounter();
	static QuantityCounter Pen_Quantity = new QuantityCounter();
	static QuantityCounter Toothbrush_Quantity = new QuantityCounter();
	
	
	public int setQuantity(){
	
	return generator.nextInt(1000);	
	
	}
}
