package exercise1_javaOOPS;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Create the object  and display the Student attribute
		Student s = new Student();
		System.out.println(s.toString()+"\n");
		
//	Initialize the attributes with mutators and display them 
		s.setId(1);
		s.setGroup(123);
		s.setFirstName("Nancy");
		s.setLastName("Ely");
		
		System.out.println(s.getFirstName());
		System.out.println(s.getLastName());
		System.out.println(s.getGroup());
		System.out.println(s.getId());
		
		
//		Create one more object and initialize the data members using constructors 
		
		Student s2 = new Student(3,"Elen", "Qween", 998);
		System.out.println("\n" + s2.toString());
		
	}

}
