package multithreading;

public class TestJoinMethod1 extends Thread {
	public void run() {
		System.out.println("Running");
	}

	public static void main(String[] args) {
		TestJoinMethod1 t1=new TestJoinMethod1();
		TestJoinMethod1 t2=new TestJoinMethod1();
		System.out.println("Name of t1 :" +t1.getName());
		System.out.println("Name of t2 :" +t2.getName());
		System.out.println("ID of t1 : " +t1.getId());
		
		t1.start();
		t2.start();
		t1.setName("Pradnya");
		System.out.println("After changing name of t1 : "+t1.getName());


	}

}
