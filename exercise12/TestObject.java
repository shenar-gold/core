package exercise12;

public class TestObject {

	static public void main(String[] args) {
		HourlyRateEmployee h = new HourlyRateEmployee();
		h.Pay();
		
		
		SalariedEmployee s = new SalariedEmployee();
		System.out.println(s.PayEmployee());
		System.out.println(s.toString());	
		
	}
	
}
