package Insect;

public class Insect {
	/* instance variable by convention declared below class.  This is class level declaration, 
	 * same as method are called Class Member. 
	 */
	private double weight;
	private int x;
	private int y;
	
	//static constant/variables
	public static final double DIST_WEIGHT_LOSS_FACTOR = 0.01;
	private static int population = 0;
	public static final int DEFAULT_X = 0;
	public static final int DEFAULT_Y = 0;
	
	
	//constructor
	/* constructor is the only function without return type and void and
	 * must be same name as class. 
	 */
//	public Insect (double wgt, int xVal, int yVal) {
//		weight = wgt;
//		x = xVal;
//		y = yVal;
//		population++;
//	}
	
	//best practice is to use same identifier name for parameter and instant variable but they are different
	//use 'this' to refer to the instant of the class
	public Insect (double weight, int x, int y) {
		this.weight = weight;
		this.x = x;
		this.y = y;
		population++;
	}
	
	//overloading constructor
	public Insect (double initWgt) {
		weight = initWgt;
		x = DEFAULT_X;
		y = DEFAULT_Y;
		population++;
	}
	
	//public method is the 'interface' if the class
	public void move(int newX, int newY) {
		//calculate distance
		double distance = calDistance(x, y, newX, newY);
		if(distance>0) {
			x = newX;
			y = newY;
			System.out.printf("moved %.2f units\n", distance);
		}
		else {
			System.out.println("staying put");
		}
		
	}
	
	//getter or accessor 
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public double getWeight() {
		return weight;
	}
	
	
	// static getter, can only access via class level
	public static int getPopulation() {
		return population;
	}
	
	//setter or mutator 
	public void setX(int newX) {
		if(isLegalX(newX)) {
			x = newX;
		}
		else {
			System.out.println("pls input positive value");
		}
	}
	
	public void setY(int newY) {
		if(isLegalY(newY)) {
			y= newY;
		}
		else {
			System.out.println("pls input positive value");
		}
	}
	
	//'helper' method used only internally, is private and static(not invoked on any instance)
	private static double calDistance(double x1, double y1, double x2, double y2) {
        		
		return Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
	}
	
	public static boolean isLegalX(int newX) {
		return (newX>0 ? true : false);
	}
	
	public static boolean isLegalY(int newY) {
		return (newY>0 ? true : false);
	}
	
	
	// use main for test method 
	public static void main(String[] args) {
		Insect bug1 = new Insect(10, 100, 90);
		Insect bug2 = new Insect(4, -300, 400);
		bug1.move(300, 20);
		bug2.move(-300,400);
		double rdm = Math.random();
		double orig = rdm*7;
		System.out.println(rdm);
		System.out.println(orig);
		System.out.println((int)(orig));
		
	}

}
