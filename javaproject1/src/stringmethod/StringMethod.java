package stringmethod;

public class StringMethod {

	public static String s = "dukeprogramminge";
	
	public StringMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	    String b = s.substring(4,7);
	    System.out.println(b);
	    int length = s.length();
	    System.out.println("string length is " + length);
	    System.out.println(s.indexOf("f"));
	    System.out.println(s.indexOf("e"));
	    System.out.println(s.indexOf("e",4));
	    System.out.println(s.startsWith("dukep"));
	    System.out.println(s.endsWith("dukep"));
	    
	}

}
