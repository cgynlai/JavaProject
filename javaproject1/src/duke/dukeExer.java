package duke;

import java.util.Random;

public class dukeExer {

	
	public static void simulate(int rolls) {
	    
		Random rand = new Random();
		int[] counts = new int[13];
		
		for(int i=0; i<=rolls; i++) {
			int d1 = rand.nextInt(6) + 1 ;
			int d2 = rand.nextInt(6) + 1;
			counts[d1+d2] += 1; 
		}
		
		for(int i=2; i<13; i++) {
			System.out.println( i + "'s" + " : " + "\t" +counts[i]);
		}
	}
	
	
	
	//int[] rand = new int[3];
	int[] rand = {2,3,4};
	
	
	
	
	
	
	
	public static void main(String[] args) {
		dukeExer.simulate(1000);

	}

}
