package Insect;

public class InsectClient {

	public static void main(String[] args) {
		System.out.println("Population: " + Insect.getPopulation());
		Insect buzz1 = new Insect(10, 200, 300);
		System.out.println("Population: " + Insect.getPopulation());
		System.out.println("X position: " + buzz1.getX() + "; " + "Y position: " + buzz1.getY());
		System.out.println("weight is: " + buzz1.getWeight());
		buzz1.setX(500);
		System.out.println("X position: " + buzz1.getX() + "; " + "Y position: " + buzz1.getY());
		buzz1.setX(-500);
		System.out.println("X position: " + buzz1.getX() + "; " + "Y position: " + buzz1.getY());
		
		Insect bug2 = new Insect(32);
		System.out.println("weight is: " + bug2.getWeight());
		System.out.println("X position: " + bug2.getX() + "; " + "Y position: " + bug2.getY());
	}

}
