package implementComparable;
import java.util.Comparator;


public class Item implements Comparable<Item> {
   private int value;
   private int weight;
   private String name;
   
	public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

	public Item(int val, int wgt, String name) {
		this.value = val;
		this.weight = wgt;
		this.name = name;
	}

//	@Override
//	public int compareTo(Object o) {
//		if (o instanceof Item) {
//		Item otherItem = (Item) o;
//		//return neg number if this object is less than passed in object
//		// sort on value
//		//return -(this.weight - otherItem.weight);
//		return -Integer.compare(this.weight, otherItem.weight);
//	     }
//		throw new RuntimeException("wrong type");
//	}
	
	@Override 
	public int compareTo(Item otherItem) {
		return -this.name.compareTo(otherItem.name);
	}
	
	
	
	public static Comparator<Item> itemWeightComparator = new Comparator<Item>() {
	    @Override
	     public int compare(Item a, Item b) {
	    	if(a.weight == b.weight) {
	    		return -(a.name.compareTo(b.name));
	    	} else {
	    		return a.weight-b.weight;
	    	}
	    	
	    	// return a.weight - b.weight;
	     }
	};
	
	
	@Override 
	public int hashCode() {
		int result =17;
		result = result*31 + value;
		result = result*31 + weight;
		result = result*31 + name.hashCode();
		return result;
		//return Integer.hashCode(weight);
	}
	
	@Override 
	public boolean equals(Object o) {
	   if(o instanceof Item) {
		   Item otherItem  = (Item) o;
		   return this.value == otherItem.value;
	   }
	   throw new RuntimeException("worng type");
	}
	
	@Override
	public String toString() {
		return "ITEM [ value: " + value + "  weight: " + weight + " name: " + name + " ]";
	}
}
