package com.liljava.store.inventory;

public class Inventory {

	public static void main(String[] args){
		ItemManager.ini();
		for (Item item : ItemManager.items){
			
		System.out.println("Name:" + item.returnName());
		System.out.println("Rating:" + item.returnRating());
		System.out.println("Quantity:" + item.returnQuantity());
		System.out.println("Cumulative Price:" + item.returnPrice());
		System.out.println("");
		
		}
	}
}
