package exception_handling;

class MyException extends Exception{
	
	String title;
	
	public MyException(String k) {
		super(k);
		this.title = k;
	}
}

public class MyExceptionTest {


	public void myfunction() throws MyException {
		
		try {
			
			int y = 10/0; 
			
		}catch(ArithmeticException e) { 
			throw new MyException("My exception");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			MyExceptionTest tstE = new MyExceptionTest();
			
			tstE.myfunction();
			
		}catch (MyException e) {
			System.out.print(e.title);
		} 
		
	}
	

}
