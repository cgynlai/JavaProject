package Inheritance;

public class Wolf extends Canine {
    protected int rank;
	public Wolf(int rank, double size) {
		// super means a call to the superclass constructor and must be first line of child constructor
		// must call super method and supply parameter in subclass
		super(size); 
		this.rank = rank;
	}

	public static void main(String[] args) {
		Wolf alpha = new Wolf(2, 20.5);
		alpha.bark(); // call the version that in the class that alpha is pointing to. 
		//overridden method can have different visibility, however child class can't restrict parent's visibility
		//meaning parent could have private method and child could override it to 'public' but reverse is not allowed
     
	}
	
	//overidding method from parent, method has same signature
	public void bark() {
		for(int i=0; i<3; i++) {
			super.bark();
		}
	}

}
