package exception_handling;

class MyRuntimeException extends RuntimeException{
	
	int code;
	
	public MyRuntimeException(String msg) {
		super(msg);
		this.code = code;
	}
	
}

public class MyRuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		 int res = 10/0;
		 System.out.print(res);
		}catch(ArithmeticException e) {
			throw new MyRuntimeException("MyRuntimeMesg is running...");
		}
		
	}

}
