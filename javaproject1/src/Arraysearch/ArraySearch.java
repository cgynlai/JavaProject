package Arraysearch;


public class ArraySearch {
	

	public static void main(String[] args) {
		String[] concepts = {"abs", "poly", "encap", "inherit"};
		String result = searchStringArray("poly", concepts);
        System.out.println(result);
		result = searchStringArray("encap1", concepts);
		System.out.println(result);
		
	}
	
	public static String searchStringArray (String target, String[] arr) {
		String result = "not found";
		for (String element : arr) {
			if(element.equals(target)) {
				result = "found";
				break;
			}
		}
		return result;
	}

}
