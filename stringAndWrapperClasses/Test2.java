package stringAndWrapperClasses;

import java.util.Arrays;

//(i) print each character separately
//(ii) print length of string variable
//(iii) print it reverse
//(iv) finally convert it into a character array
//(iv) finally convert it into a byte array

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "USM for unlimited opportunities";
		//		(i) print each character separately
		int i=0;
		while(i != (str1.length()-1)) {
			System.out.print(str1.charAt(i));
			i++;
		}
		
		//  (ii) print length of string variable
		System.out.print("\n The lenght of string is :" +str1.length()+ "\n");
		
		//		 (iii) print it reverse
		
		for(int k = str1.length()-1; k>=0; k--) {
			System.out.print(str1.charAt(k));
		
		}
		
		//		(iv) finally convert it into a character array
		System.out.print("\n");
		char[] ch = str1.toCharArray();
		System.out.println("Array as String" + Arrays.toString(ch));
		for(char c:ch) {
			System.out.print(c);
		}
		

		//		(iv) finally convert it into a byte array
		System.out.print("\n");
		byte[] b = str1.getBytes();
		System.out.println("Array as String" + Arrays.toString(b));

		
		
	}

}
