package exercises1;

import java.util.Random;
public class DisplayRandomYesNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		
		
		for(int i=0; i<=10; i++) {
			
			Boolean result = rd.nextBoolean();
			System.out.println(i+". "+ result);

		}
				
		
		
	}

}
