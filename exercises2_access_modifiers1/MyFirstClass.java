package exercises2_access_modifiers1;

//public class accessible to all packages 
public class MyFirstClass {

	//public variable accessible all packages
	public int id;
	
	String description;
	
	//private variable accessible inside class
	private int number;
	
	//public accessible to all packages
	public MyFirstClass(int id){
		this.id = id;
		this.number = 0;
	}
	
	//private method accessible inside class
	private void IncreaseNumber(int n) {
		this.number = n;
	}
	
	//private method accessible inside package and inherited classes
	protected void setBonus(int k) {
		IncreaseNumber(k);
	}
	
	//public method accessible to all packages
	public int getNumber() {
		return this.number;
	}
	
}
