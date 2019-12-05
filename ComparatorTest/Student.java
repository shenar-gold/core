package ComparatorTest;

public class Student {
	
	String firstName;
	String lastName;
	int id;
	
	public Student(String firstName, String lastName, int id) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	String getFirstName(){
		
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	int getId() {
		return id;
	}
	
}
