package com.liljava.store.inventory;

public class PriceCalc {

	
	
	static PriceCalc Toothpick_Price = new PriceCalc();

	
	public enum UnitPrice{
		TOOTHPICK_PRICE(1.50);
		
		private final double UNIT_PRICE;
		
		UnitPrice(double UNIT_PRICE){
			this.UNIT_PRICE = UNIT_PRICE;
		}
		
		public double getUnitPrice(){
			
			return UNIT_PRICE;
		}
	}
	
	
	
	
	
	
	public static double Quantity;
	
	public double totalCalc(){
		
		
		return UnitPrice. * Quantity;
		
	}
	
	public static void main(String[] args){
		System.out.println(Toothpick_Price.totalCalc());
		
		
	}
}
