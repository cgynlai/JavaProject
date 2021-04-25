package Inheritance;

public class DogClient extends Dog {

	public DogClient(String name, double size) {
		super(name,size);
		
	}

	public static void main(String[] args) {
		DogClient dog9 = new DogClient("huskie", 30.5);
		dog9.bark();

	}

}
