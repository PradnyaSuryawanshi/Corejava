package multithreading;

public class TestDaemonThread extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		} else
			System.out.println("User Thread");
	}

	public static void main(String[] args) {
		TestDaemonThread d1 = new TestDaemonThread();
		TestDaemonThread d2 = new TestDaemonThread();
		TestDaemonThread d3 = new TestDaemonThread();

		d1.setDaemon(true);
		d2.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
	}

}
