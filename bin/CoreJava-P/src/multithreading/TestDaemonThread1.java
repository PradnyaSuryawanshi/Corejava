package multithreading;

public class TestDaemonThread1 extends Thread {
    public void run() {
    	System.out.println(Thread.currentThread().getName());
    	System.out.println(Thread.currentThread().getId());
    	System.out.println(Thread.currentThread().isDaemon());
    }
	
	
	public static void main(String[] args) {
		TestDaemonThread1 t1= new TestDaemonThread1();
		TestDaemonThread1 t2 = new TestDaemonThread1();
		t1.start();
		//t1.setDaemon(true);
		//t1.start();
		t2.start();

	}

}
