package ComparatorTest;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	int length;
	
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.firstName.length()> o2.firstName.length()) {
			length = o2.firstName.length(); 
		}
		else
		{
			length = o1.firstName.length();
		}
		
		for(int i= 0; i<length;i++ ) {
			if (o1.firstName.charAt(i) < o2.firstName.charAt(i)) {
				return -1;
			} 
			else if (o1.firstName.charAt(i) == o2.firstName.charAt(i)) {
				return 0;
			}
			else if(o1.firstName.charAt(i) > o2.firstName.charAt(i)) {
				return 1;
			} 
			
		}
	
		return 0;
	}

}
