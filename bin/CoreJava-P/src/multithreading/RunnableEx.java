package multithreading;

public class RunnableEx  implements Runnable{
	@Override
	public void run() {
		System.out.println("thread is running ");
		
	}

	public static void main(String[] args) {
		RunnableEx r1= new RunnableEx();
		Thread t1= new Thread(r1);
		//r1.run();
		t1.start();

	}

	
}
