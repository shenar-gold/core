package multithreading;


	class Test{
		
		int number;
		boolean possible = false; 
		
		synchronized void setNumber(int i) {
			

			if (possible == false) {
				this.number = i;
				possible = true;
//				System.out.println(Thread.currentThread() + " thread is working...");
				System.out.println("Result: set number to " + this.number + "\n");
				notify();
				
			}
			else {
		
				try {
						wait();
						System.out.println(Thread.currentThread() + " thread is waiting..." +"\n");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}
		
		synchronized int getNumber() {
			
			if (possible == true) {
//				System.out.println(Thread.currentThread() + " thread is working...");
				System.out.println("Result: get number " + this.number + "\n");
				possible = false;
				notify();
				
			}
			else {
				try {
						wait();
						System.out.println(Thread.currentThread() + " thread is waiting..." + "\n");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			
			return this.number;
		}
		
	}

	//	class #1 implements from Runnable. Class #1 set number
	
	class RunnableTest1 implements Runnable {

		Test testObject;
		
		public RunnableTest1(Test rt){
			testObject = rt;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			

				for(int i=0; i<5; i++) {
					testObject.setNumber(i);
				}
		}
		
	}
	
	//	class #2 implements from Runnable. Class #1 get number
	
	class RunnableTest2 implements Runnable {

		Test testObject;
		
		public RunnableTest2(Test rt){
			testObject = rt;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			int b;
			for(int i =0; i<5; i++) {
				b = testObject.getNumber();
			}

		}
		
	}	
	

	
public class TestThread {	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        	
		Test tcl = new Test();	
		
		//		tread #1 set number
		RunnableTest1 rn1 = new RunnableTest1(tcl);	
		Thread t1 = new Thread(rn1);
		
		
        //		tread #2 get number	
		RunnableTest2 rn2 = new RunnableTest2(tcl);	
		Thread t2 = new Thread(rn2);
		
		//	run threads	
		t2.start();
		t1.start();
	}
	

}
