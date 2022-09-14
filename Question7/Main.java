package Question7;

public class Main {
	
	public static void main(String[] args) {
		ThreadA a1=new ThreadA();
		ThreadA a2=new ThreadA();
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a2);
		t1.setPriority(10);
		t2.setPriority(5);
		t1.setName("Dhoni");
		t2.setName("Kohali");
		
		t1.start();
		t2.start();
	}

}
