package shopping;

import java.util.HashMap;
import java.util.Map.Entry;

class shoppingcart{
	HashMap<item,Integer> map=new HashMap<>();
	void addToCart(item item,int quantity) {
		
		map.put(item,quantity);
	}

	void updateQty(item item,int quantity) {
		map.replace(item,quantity);
	}

	int displayQty(item item) {
		return map.get(item);
	}

	void deleteItem(item item) {
		map.remove(item);
	}

	double displayBill() {
		double bill=0;
		for (Entry<item, Integer> it : map.entrySet()) 
            bill+=item.getPrice(it.getKey())*it.getValue();
		System.out.println(bill);
		return bill;
	}
};


public class shop {
	public static void main(String[] args) {
	item item1=new item("laptop","Dell",80000);
	item item2=new item("mouse","hp",3000);
	item item3=new item("pendrive","sony",4000);
	item item4=new item("keyboard","dell",2000);
	
	shoppingcart obj=new shoppingcart();
	obj.addToCart(item1,1);
	obj.addToCart(item2,3);
	obj.addToCart(item3,2);
	obj.addToCart(item4,1);
	
	int num=obj.displayQty(item2);
	System.out.println("Number of item is "+num);
	
	obj.updateQty(item3,10);
	num=obj.displayQty(item3);
	System.out.println("Number of item is "+num);
	obj.deleteItem(item2);
	obj.displayBill();
}
}




