package Arraysearch;

public class ExternalClassDemo {

	public static void main(String[] args) {
		String[] str1 = {"test1", "test2", "test3"};
		int[] numArr = { 1,2,3,4,5};
		
		//call method externally
		System.out.println(ArraySearch.searchStringArray("test1", str1));
		System.out.println(ArraySearch.searchStringArray("test", str1));
		
		//overload method call
		System.out.println("Overload method call show ...");
		System.out.println("String version : " + ArraysearchOverload.searchStringArray2("test5", str1));
		System.out.println("int version : " + ArraysearchOverload.searchStringArray2(5, numArr));
	}

}
