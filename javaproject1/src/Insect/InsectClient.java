package Insect;

public class InsectClient {

	public static void main(String[] args) {
		System.out.println("Population: " + Insect.getPopulation());
		Insect buzz1 = new Insect(10, 200, 300);
		System.out.println("Population: " + Insect.getPopulation());
		System.out.println("X position: " + buzz1.getX() + "; " + "Y position: " + buzz1.getY());
	}

}
