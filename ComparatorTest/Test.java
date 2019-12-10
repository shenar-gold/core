package ComparatorTest;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Student> stHashSet = new TreeSet<Student>(new NameComparator());
		Student st1 = new Student("Maria", "A", 1);
		Student st2 = new Student("Bob", "Q", 2);
		Student st3 = new Student("Alica", "Q", 2);
		
		stHashSet.add(st1);
		stHashSet.add(st2);
		stHashSet.add(st3);
		
		for(Student st: stHashSet) {
			System.out.println(st.toString());
		}
//		System.out.println(stHashSet);
		
//		stHashSet.compare((Student) st1, (Student) st2);

	}

}
