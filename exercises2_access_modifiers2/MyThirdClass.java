package exercises2_access_modifiers2;

import exercises2_access_modifiers1.MyFirstClass;


//public class accessible to all packages 
public class MyThirdClass extends MyFirstClass {

	//default variable accessible inside packages
	String FirstName;
	
	//protected variable accessible inside packages and inherited classes
	protected String LastName;
	
	//public constructor accessible to all packages
	public MyThirdClass(int id, String fn, String ln) {
		
		super(id);
		
		this.FirstName = fn;
		this.LastName = ln;	
	}
	
}
