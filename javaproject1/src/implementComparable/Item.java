package implementComparable;

public class Item implements Comparable {
   private int value;
   private int weight;
   
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

	public Item(int val, int wgt) {
		this.value = val;
		this.weight = wgt;
	}

	@Override
	public int compareTo(Object o) {
		Item otherItem = (Item) o;
		//return neg number if this object is less than passed in object
		// sort on value
		return this.value - otherItem.value;
	}

}
