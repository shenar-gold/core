package stringAndWrapperClasses;

//Create a StringBuffer object with "Java is " 
//and append the following to the same " an OO Language" 
//and print the String buffer

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("Java is ");
		s.append("an OO Language");
		System.out.print(s);
	}

}
