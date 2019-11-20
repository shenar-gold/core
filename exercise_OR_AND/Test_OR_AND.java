package exercise_OR_AND;

public class Test_OR_AND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 10;
		int b = 13;
		int c = 0;
		
		
		//check && logical operator		
		boolean resultAND = c>b && a/c == 0;
		System.out.println(resultAND);
		
		
		//check || logical operator
		boolean resultOR = c<b || a/c == 0;
		System.out.println(resultOR);
		
		resultOR = c>b || a == 10 || c/c==0;
		System.out.println(resultOR);
		
		
		
		
	}

}
