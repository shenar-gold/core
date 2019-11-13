package exercises2_access_modifiers1;

//default class accessible only inside package

class MySecondClass extends MyFirstClass {
	
	//private variable accessible inside class
	private int Salary; 
	
	
	//public accessible to all packages
	public MySecondClass(int id, int salary1) {
		super(id);
		this.setSalary(salary1);
	}

	//public accessible to all packages
	public int getSalary() {
		return Salary;
	}

	//public accessible to all packages
	public void setSalary(int salary) {
		Salary = salary;
	}

	
}
