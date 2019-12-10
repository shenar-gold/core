package stringAndWrapperClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import org.omg.IOP.Encoding;



public class StringBuilderTest {

//	Take the problems in 1,2 and 3 
//	and create StringBuilder objects 
//	and perform the similar operations 
	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//		problem #1. Compare String variables 
		boolean isEqual = true; 
		
		StringBuilder userName = new StringBuilder("some name");
		
		System.out.print("Input user name: ");
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		
		String inputName = reader.readLine();
		if (userName.length() == inputName.length()) {
			
			for(int i = 0;  i< userName.length(); i++) {
				
				 if (userName.charAt(i) != inputName.charAt(i)) {
					 System.out.println("User not valid");
					 isEqual = false; 
					 break;
				 }
			}
			if (isEqual) {
			System.out.println("User is valid");
			}
		} 
		else {
			System.out.println("not valid user");
		}
		
		
		
		//		problem #2. 
		//		(i) print each character separately
        //		(ii) print length of string variable
        //		(iii) print it reverse
        //		(iv) finally convert it into a character array
        //		(iv) finally convert it into a byte array
		
		StringBuilder str1 = new StringBuilder("USM for unlimited opportunities");			
		int b=0;
		while(b != (str1.length()-1)) {
			System.out.print(str1.charAt(b));
			b++;
		}
		System.out.println("\nLentgh of StringBuilder is: "+str1.length());
		
		
		StringBuilder reverse = str1.reverse();
		System.out.println("StingBuilder reverse: " + reverse.toString());
		
		char[] ch2 = new char[str1.length()];
		str1.getChars(0, str1.length(),ch2, 0);
		System.out.println("Arrays of char of StringBuilder: "+ Arrays.toString(ch2));
		

		byte[] b2 = str1.toString().getBytes();
		System.out.print("Arrays of bytes of StringBuilder: "+ Arrays.toString(b2));

		
	}

}
