package stringAndWrapperClasses;


//Write a program which reads three numbers 10, 10.1 
//and -10.001 store them in three different Strings 
//and convert them into appropriate types 
//and print their sum

public class ConvertTypesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1 = "10";
		String num2 = "10.1";
		String num3 = "10.001";
		
		int res1 = Integer.parseInt(num1);
		System.out.println(res1);
		float res2 = Float.parseFloat(num2);
		System.out.println(res2);
		float res3 = Float.valueOf(num3);
		System.out.println(res3);
		
		float result = res1 + res2 + res3;
		
		//		result is 30.101002. Why?
		
		System.out.print(result);
	}

}
