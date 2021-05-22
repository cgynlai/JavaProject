package tutorial1;
import java.util.*; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
//	   String inputString = sc.next();
		
//       System.out.println(inputString);
//       int[] Arrname = new int[5];
    		   
    		   
    	ArrayList<String> names = new ArrayList<String>();
       names.add("john");
       names.add("Alex");
       
       System.out.println(names.get(1));
       
    		   /** 
    		    * 
    		    **/
	
	int total = 0;
	int[] sumtotal = { 1,2,3,4,5 };
	for (int element : sumtotal) {
		element = element +1;
		total = total + element;
	}
	System.out.println(total);
	System.out.println("end of test");
}
	
	
}
