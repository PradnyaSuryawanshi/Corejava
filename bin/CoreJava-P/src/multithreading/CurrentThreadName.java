package multithreading;

public class CurrentThreadName extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		CurrentThreadName t1 = new CurrentThreadName();
		CurrentThreadName t2 = new CurrentThreadName();

		t1.start();
		try {
			t1.setName("Pradnya");
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		
	}

}
