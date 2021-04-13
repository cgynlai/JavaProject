package Arraysearch;

public class ArraySearch {
	

	public static void main(String[] args) {
		String[] concepts = {"abs", "poly", "encap", "inherit"};
		String result = "not found";
		for (String concept : concepts) {
			if (concept.equals("poly")) {
				result = "found";
				break;
			}
		}

		System.out.println(result);
		
		result = "not found";
		for (String concept : concepts) {
			if(concept.equals("inherit")) {
			  result = "found";
			  break;
			}
		}
		
		System.out.println(result);
	}

}
