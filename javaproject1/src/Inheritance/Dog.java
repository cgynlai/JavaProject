package Inheritance;

public class Dog extends Canine {
    protected String name; //protected modifier can be inherited by subclass
	public Dog(String name, double size) {
		super(size);
		this.name = name;
	}
	
	public void fetch() {
		System.out.println("run");
	}

}
