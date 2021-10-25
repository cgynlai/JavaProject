package stringmethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class StringMethod {

	public static String s = "dukeprogramminge";
	public static String x = s;
	 
	public StringMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	    String b = s.substring(4,7);
	    s="t";
	    System.out.println(x);
	    
	    System.out.println(b);
	    int length = s.length();
	    System.out.println("string length is " + length);
	    System.out.println(s.indexOf("f"));
	    System.out.println(s.indexOf("e"));
	    System.out.println(s.indexOf("e",4));
	    System.out.println(s.startsWith("dukep"));
	    System.out.println(s.endsWith("dukep"));
	    
	    HashSet<Integer> hi = new HashSet<Integer>();
	    Integer[] myArr = {1,2,3,5,6,4};
	    hi.addAll(Arrays.asList(myArr));
	    System.out.println("collection starts here");
	     System.out.println(hi);
	     hi.add(1);
	     hi.add(10);
	     System.out.println(hi);
	     hi.add(100);
	     hi.add(10);
	     System.out.println(hi);
	     System.out.println(hi.contains(100));
	    
	     LinkedList<Integer> llist = new LinkedList<Integer>();
	     llist.addAll(Arrays.asList(myArr));
	     System.out.println("LinkedList");
	     System.out.println(llist);
	     llist.remove(4);
	     System.out.println(llist);
	     
	     
	}

}
