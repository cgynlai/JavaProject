package Exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numeric1 nume = new Numeric1();
		nume.method1(10, 2);
		

		Numeric2 n2 = new Numeric2();
		n2.method2(10, 2);
		
		
		//need to handle compiletime exception thrown from called method3
		Numeric3 n3 = new Numeric3();
		try {
			n3.method3(18, 0);
		} catch (Exception e) {
			// to handle exception here
			e.printStackTrace();
		} 
		//program continue after catched error in catch block, so sysout will print out
		System.out.println("after Numeric3");
		
		Numeric4 n4 = new Numeric4();
		n4.method4(63, 0);
		
        
		// demo "throw" exception manually
		//NumeErr nn1 = new NumeErr();
	//	nn1.method5(10, 5);
		
        //throw checked exception, must handle
		NumeErr nn6 = new NumeErr();
		try {
			nn6.method6(10, 5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("after method6");
		
		
		
		//call self define exception
		NumeErr nn7 = new NumeErr();
		try {
			nn7.method7(10, 5);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("after method7");
		
		
		//runtime exception
		NumeErr nn5 = new NumeErr();
		nn5.method5(10, 5);
		
		//will not print out this line because method5 throw exception without handling
		System.out.println("end of main");
	}
	



}

class Numeric1 {
	int c = 5;

	public int method1(int a, int b) {
		try {
			c = a / b;

		} catch (ArithmeticException e) {
			System.out.println("err: " + e);
		}

		System.out.println("end of code");
		return c;
	}

}

// runtime exception example
class Numeric2 {
	int c;

	//Runtime(unchecked) exception will NOT require handling if calling the method
	public int method2(int a, int b) throws ArithmeticException {
		c = a / b;
		System.out.println("end of Numeric2");
		return c;
	}

}

// compiletime exception example
class Numeric3 {
	int c;

	//Compile time(checked) exception will require handling if calling the method
	public int method3(int a, int b) throws Exception {
		c = a / b;
		System.out.println("end of Numeric2");
		return c;
	}

}

// try-catch-finally example
class Numeric4 {
	int c;

	//Compile time(checked) exception will require handling if calling the method
	public int method3(int a, int b) throws Exception {
		c = a / b;
		System.out.println("end of Numeric2");
		return c;
	}
	
	public int method4(int a, int b) {
		try {
			int x = method3(a,b);
			System.out.println("method4  try block successfully executed..");
			return x;
		} catch (Exception e) {
		
		System.out.println("method4 catch error in method3");
		e.printStackTrace();
		return 1;
		} finally {
			
			System.out.println("method4 finally block executed regardless try/catch result.");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}