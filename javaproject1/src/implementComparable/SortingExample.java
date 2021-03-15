package implementComparable;

import java.util.*;



public class SortingExample {

	public SortingExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	   ArrayList<Item> items = new ArrayList<Item>();
	   Item item1 = new Item(10, 20);
	   Item item2 = new Item(20,30);
	   Item item3 = new Item(16,15);
	   Item item4 = new Item(15,20);
	   items.add(item1);
	   items.add(item2);
	   items.add(item3);
	   items.add(item4);
	   
       Collections.sort(items);
       
       for (Item item : items) {
    	   System.out.println(item.getValue() + "   " + item.getWeight());
       }
	}

}
