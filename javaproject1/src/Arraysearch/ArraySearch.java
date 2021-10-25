package Arraysearch;


public class ArraySearch {
	

	public static void main(String[] args) {
		String[] concepts = {"abs", "poly", "encap", "inherit"};
		String[] concepts2 = {"sunrise", "sunsets", "walks"};
		double d = 10.0/-0;
		int i = 010;
		int j = 07;
		
		//String result = searchStringArray("poly", concepts);
        //System.out.println(result);
        //result = searchStringArray("encap", concepts);
		//System.out.println(result);
		
		//shorten the code without 'result' variable, if 'result' will not be used anymore
		System.out.println(searchStringArray("sunrise", concepts2));
		System.out.println("d: " + d);
		System.out.println(i);
		System.out.println(j);
	}
	
	//'public' is a visibility modifier, so that can call from outside the class
	// 'static', no object or not going for instantiation
	public static boolean searchStringArray (String target, String[] arr) {
		boolean result = false;
		for (String element : arr) {
			if(element.equals(target)) {
				result = true;
				break;
			}
		}
		return result;
	}

}
