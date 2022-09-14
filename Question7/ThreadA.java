package Question7;

public class ThreadA implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			String name=Thread.currentThread().getName();
			System.out.println("inside run method of thread function   :"+i+" "+name);
		}
	  System.out.println("End of run method");
		
	}
	
	

}
