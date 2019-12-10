package stringAndWrapperClasses;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Create a String name it 'userName' and initialize with some value. 
//Create another String, accept input from the console 
//and initialize the second string. 
//Now compare the two strings 
//and print "Valid user" or "Invalid user" apply your own logic       

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String userName = "some name";
		boolean isEqual  = true;

		BufferedReader reader = new BufferedReader(
										new InputStreamReader(System.in));
		
		String inputName = reader.readLine();
		System.out.println(inputName);
		
		if (userName.length() == inputName.length()) {
			
			for(int i = 0;  i< userName.length(); i++) {
				
				 if (userName.charAt(i) != inputName.charAt(i)) {
					 System.out.print("User not valid");
					 isEqual = false; 
					 break;
				 }
			}
			if (isEqual) {
			System.out.print("User is valid");
			}
		} 
		else {
			System.out.print("not valid user");
		}
		
		
	}

}
