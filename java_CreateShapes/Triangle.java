package shape;

public class Triangle extends Shape{

	Triangle(){
		System.out.println("This is Triangle");
	}
	
	float computeArea(int h, int b) {
		float s = h*b/2;	
		return s;
	}
	
}
