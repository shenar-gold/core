package exercise12;

public class HourlyRateEmployee extends Payment implements PaymentIface {

	
//	@Override
//	void Pay() {
//		
//		System.out.println("This override method Pay() from HourlyRateEmployee");
//	}
	
	@Override
	public void payVacation() {
		// TODO Auto-generated method stub
		System.out.println("this is override PaymentIface.PayVacation() in HourlyRateEmployee");
	}
	
	
}
