package multithreading;

public class TestThreadGroup implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		TestThreadGroup runnable = new TestThreadGroup();
		ThreadGroup tg = new ThreadGroup("Parent ThreadGroup");
		
		
		Thread t1 = new Thread(tg, runnable, "one");
		t1.start();
		Thread t2 = new Thread(tg, runnable, "Two");
		t2.start();
		Thread t3 = new Thread(tg, runnable, "Three");
		t3.start();

		System.out.println(" Thread Group Name : " + tg.getName());
		tg.list();
	}

}
