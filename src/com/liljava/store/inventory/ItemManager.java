package com.liljava.store.inventory;

import java.util.ArrayList;

public class ItemManager {

	public static ArrayList<Item> items = new ArrayList<Item>();
	
	public static void ini(){
		items.add(new Pen());
		items.add(new NoteBook());
		items.add(new TennisBall());
		items.add(new Medicine());
	}

}
