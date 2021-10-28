package Exception;

public class NumeErr {
	int c;

	public void method5(int a, int b) throws ArithmeticException {
		c = a / b;
		System.out.println("method5");
		
		throw new ArithmeticException("throw demo5");
		
		// System.out.println("method5 after thrown exception");
		
	}
	
	public void method6(int a, int b) throws Exception {
		c = a / b;
		System.out.println("method6");
		
		throw new ArithmeticException("throw demo6");
		
	}
	
	public void method7(int a, int b) throws MyException {
		c = a / b;
		System.out.println("method7");
		
		throw new MyException("throw demo7");
		
	}
	
	
}

// normally self define exception extends RuntimeException or Exception
class MyException extends Exception {
	static final long serialVersionUID = -798749827982743L;
	public MyException() {
		
	}
	public MyException(String msg) {
		super(msg);
	} 
	
}
