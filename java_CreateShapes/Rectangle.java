package java_CreateShapes;

public class Rectangle extends Shape{

	Rectangle(){
		System.out.println("This is Rectangle");
	}
	
	int computeArea(int a, int b) {
		int s = a*b;	
		return s;
	}
}
