package exercise_string;

public class SearchSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "goMango";
		
		
        //		2.try to find a string starts and ends with a given substring
		
		int index = str1.indexOf("Man", 0);
		String result = index !=-1 ? "found": "not found";
		System.out.println(result+ " at " + index);
		
		
		int indexLast = str1.lastIndexOf("go", str1.length()-2);
		String resultLast = indexLast !=-1 ? "found": "not found";
		System.out.println(resultLast+ " at " + indexLast);
		
		//		write a program to find a given string is Palindrome or not  
		System.out.println("---------------test Palindrom---------------");
		
		String str2 = "Madam3";
		String copyStr2 = str2.toLowerCase();
        boolean isPalindrome = true;
		
		for(int i=0; i<copyStr2.length();i++) {
			
			if (copyStr2.charAt(i) != copyStr2.charAt(copyStr2.length()-i-1)) {
				isPalindrome = false;
				break;
			}	
		}
		
		System.out.println(str2 + " is Palidrom = " +  isPalindrome);

		
			
		
	}

}
