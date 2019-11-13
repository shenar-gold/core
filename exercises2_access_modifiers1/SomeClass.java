package exercises2_access_modifiers1;

public class SomeClass {

	public static void main() {
		
		MySecondClass subclass = new MySecondClass(3, 400000);
		//calling protected method inside package
		subclass.setBonus(5);
		
		//calling public method inside package
		subclass.getNumber();
		
		MyFirstClass mc = new MyFirstClass(5);
		mc.description = "dfgf";
	}
}
