package Arraysearch;

public class ArraysearchOverload {

	public static void main(String[] args) {
		
		/* method overload: in Java, to overload a method, simply need two or more versions that differ in the types, order, 
		and/or number of formal parameters. More formally, a method is overloaded when there are two versions with the same name, 
		but different signatures. Note that return types are not involved in this definition. Return type can be different or the same. 
		*/
		
		
		
		}
	
	public static boolean searchStringArray2 (int num, int[] arr) {
		boolean result = false ;
		for(int element : arr) {
			if(element == num) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	public static boolean searchStringArray2 (String match, String[] arr) {
		boolean result = false ;
		for(String element : arr) {
			if(element.equals(match)) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	

}
