package exercise1_javaOOPS;

public class Student {

	private int id;
	private String FirstName;
	private String LastName;
	private int group;
	
	Student(){
		
	}
	Student(int id, String fn, String ln, int g){
		this.id = id;
		this.group = g;
		this.FirstName = fn;
		this.LastName = ln;
	}

	void setFirstName(String fn) {
		this.FirstName = fn;
	}
	
	void setLastName(String ln) {
		this.LastName = ln;
	}
	
	void setId(int id) {
		this.id = id;
	}
	void setGroup(int g) {
		this.group = g;
	}
	
	String getId() {
		return "student's Id is"+ this.id;
	}
	
	String getGroup() {
		return "student's group is"+ this.group;
	}
	
	String getFirstName() {
		return "student's FirstName is"+ this.FirstName;
	}
	String getLastName() {
		return "student's LastName is"+ this.LastName;
	}
	
	@Override
	
	public String toString() {
		return "class Student: " + this.id +' '
								 + this.group + " "
								 + this.FirstName + " "
								 + this.LastName;
	}
	
}
