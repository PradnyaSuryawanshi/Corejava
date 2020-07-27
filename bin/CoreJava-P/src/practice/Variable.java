package practice;

public class Variable {
	int a = 10;
	static int c = 30;

	public static int num() {
		int b = 20;
		//System.out.println("Local Variable : " + b);
		return b;
		
	}

	public static void main(String[] args) {
		System.out.println("static variable : " + c);
		System.out.println("Local Variable : " + num());	}

}
