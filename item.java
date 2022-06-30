package shopping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class item {

	private static int ItemId=0;
	private String Name;
	private String Description;
	private double Price; 
	item(String name,String Description,double price){
	
	this.Name=name;
	this.Description=Description;
	this.Price=price;
	item.ItemId++;
	}
   static double getPrice(item item) {
	   return item.Price;
   }
};


