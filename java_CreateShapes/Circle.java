package java_CreateShapes;

public class Circle extends Shape {

	Circle(){
		System.out.println("This is a circle");
	}
	
	double computeArea(int a) {
		double s = Math.PI*a*a;	
		return s;
	}
}
