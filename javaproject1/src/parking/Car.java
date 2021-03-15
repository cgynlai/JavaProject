package parking;

public class Car {
	
	private String ownerName;
	private int licenceNum;
	private int regNum;

	public Car(String name, int license, int regNum) {
		this.ownerName = name;
		this.licenceNum = licenceNum;
		this.regNum= regNum;
		}
	
	@Override
	public String toString() {
		//return string rep. of a car instance
		return ownerName + " owns car " + regNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		Car carObj = (Car) obj;
		return this.regNum == carObj.regNum;
		
	}
	
	public static String str1 = "hello !";
	public static String str2 = "hello !";

	public static void main(String[] args) {
		Car c1 = new Car("Alex", 123, 12345);
        System.out.println(c1);
        Car c2 = new Car("Alex", 123, 12345);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(str1 == str2);
	}

}
