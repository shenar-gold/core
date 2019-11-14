package java_CreateShapes;

public class CreateShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square sqr1 = new Square();
		int s = sqr1.computeArea(2);
		System.out.println("input with Int type");
		sqr1.ShowResult(s);
		
		Circle circle1 = new Circle();
		double c = circle1.computeArea(5);
		System.out.println("input with Double type");
		circle1.ShowResult(c);
		
		Rectangle rect1 = new Rectangle();
		int r = rect1.computeArea(7, 6);
		System.out.println("input with Int type");
		rect1.ShowResult(r);
		
		
		Triangle tr1 = new Triangle();
		float t = tr1.computeArea(8, 3);
		System.out.println("input with Float type");
		tr1.ShowResult(t);
		
		Rhombus rhomb1 = new Rhombus();
		float rh = rhomb1.computeArea(3, 4);
		System.out.println("input with float type");
		rhomb1.ShowResult(rh);
		
		
	}

}
