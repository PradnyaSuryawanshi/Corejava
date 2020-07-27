package practice;

public class OverloadingEx {
	
	public static String show(String message) {
		return message;
	}
	public static int show(int content) {
		return content;
	}

	public static void main(String[] args) {
		System.out.println(OverloadingEx.show("Hi Method Overloding example"));
		System.out.println(OverloadingEx.show(1));

	}

}
