package exception_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Add10thIndexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		char[] s = new char[10];
		
		InputStreamReader inStreamreader = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inStreamreader);
		
		
		
		String s = "";
		int k=0;
		
		try {
			
			 while ( k !=10 ) {
				 
				 s = s + (char)reader.read();
				 
				 k++;
			 }
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int i=0;
		
			while (i <= s.length()) {
				
//				try {
					System.out.print(s.charAt(i));
					i++;
//				}
//				catch(StringIndexOutOfBoundsException e) {
//					
//				}
				
			}
	}

}
