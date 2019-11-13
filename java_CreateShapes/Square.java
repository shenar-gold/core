package shape;

public class Square extends Shape{

	Square(){
		System.out.println("This is Square");
	}
	
	int computeArea(int a) {
		int s = a*a;
		return s;
		
	}
	
}



