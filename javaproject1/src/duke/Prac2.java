package duke;

import java.util.ArrayList;
import java.util.Arrays;

public class Prac2 {
	
	//String str = "I Of of the play of she she.";
	String str ="an Odette and Whitegrass alumnus who also headed up the Odette At Home delivery programme during the “circuit breaker” last year, is now putting his own dishes into round, metal tiffins and sending them out to diners eager for a taste of his take on elevated local and regional cuisine.";
	String[] strSplit = str.split("\\W+");
	private ArrayList<String> myWords;
	private ArrayList<Integer> myFreq;
	StringBuffer sb = new StringBuffer("hello");
	
	
	public Prac2() {
		myWords = new ArrayList<String>();
		myFreq = new ArrayList<Integer>();
		
	}
	
	public void findUnique() {
		for(String s : strSplit) {
		   int index = myWords.indexOf(s);
		   if (index == -1) {
			 myWords.add(s);
			 myFreq.add(1);
		   }
		   else {
			   int value = myFreq.get(index);
			   myFreq.set(index, value+1);
		   }
		   }
		}
	
	

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prac2 myTest = new Prac2();
		for(String s : myTest.strSplit) {
			s= s.toLowerCase();
		System.out.println(s);
		}
		
		System.out.println(Arrays.asList(myTest.strSplit).indexOf("the"));
		myTest.findUnique();
		for(int i=0; i<myTest.myFreq.size(); i++) {
			System.out.println(myTest.myWords.get(i) + " : " + myTest.myFreq.get(i));
		}
		System.out.println(myTest.str.charAt(3));
		System.out.println(myTest.sb);
		System.out.println(myTest.sb.reverse());
	}

}
