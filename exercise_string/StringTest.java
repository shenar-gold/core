package exercise_string;

public class StringTest {

	// extract domain from given email
	String extractDomain(String anyStr){
		
		return anyStr.substring(anyStr.indexOf('@'));
	}

	
	//	count how many times the letter 's' occurs in Mississippi
	int countOccurranceOfChar(String anyStr, char searchedChar) {
		
		int count=0;
		int index=0;
		
		while(index<anyStr.length()) {
			
			count = anyStr.charAt(index) == searchedChar ? count+1 : count;
			index++;
		}
		
		return count;
	}
	
    //	print alter letters in upper case
	void printLettersInUpperCase (String someStr) {
		
		
		String upperCaseLetters = "";
		
		for(int i=0; i<someStr.length();i++) {
			
			if (someStr.charAt(i) >= 65 && someStr.charAt(i) <= 90) {
				
				upperCaseLetters = upperCaseLetters + someStr.charAt(i)+ "\t";
			}
			
		}
		System.out.println(upperCaseLetters);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String str1 = "AnyName@gmail.com";
		
		StringTest tst = new StringTest();
		
		System.out.println(tst.extractDomain(str1));
		System.out.println(tst.countOccurranceOfChar("Mississippi", 's'));
		
		tst.printLettersInUpperCase("WorLD");
		
	}

}



