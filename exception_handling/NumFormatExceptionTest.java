package exception_handling;

public class NumFormatExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Name";
		
		try {
			int i = Integer.parseInt(str);
		}
		catch(NumberFormatException numfe){
			System.out.println("Here is NumberFormatException...");
			numfe.printStackTrace();
		}
	}

}
