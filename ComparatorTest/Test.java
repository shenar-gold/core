package ComparatorTest;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Student> stHashSet = new HashSet<Student>();
		Student st1 = new Student("Maria", "A", 1);
		Student st2 = new Student("Bob", "Q", 2);
		
		stHashSet.add(st1);
		stHashSet.add(st2);
		
		System.out.println(stHashSet);

	}

}
