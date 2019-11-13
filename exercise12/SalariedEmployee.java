package exercise12;

public class SalariedEmployee extends PaymentABS implements  PaymentIface{

	@Override
	int PayEmployee() {
		// TODO Auto-generated method stub
		return 40000;
	}

	@Override
	public void payVacation() {
		System.out.println("this is override PaymentIface.PayVacation() in SalariedEmployee");
		
	}

}
