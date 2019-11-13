package exercise8;


class Customer{
	
	
	
}

public class LoopObjects {
	
	Customer[] array = new Customer[2];
	
	public static void CreateObject(){
		for(int i=0;i<2;i++){
		array[i] = new Customer();
		}
	}
	
	

	public static void main(String[] args) {


			CreateObject();
			
			for(int i=0; i<2; i++) {
				System.out.println(loopObj.array[i]);
			}
			
	}
}
