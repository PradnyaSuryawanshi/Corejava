package practice;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		String str = "Hi welcome to java";
		String[] words= str.split(" ");
		String[] afterTwoWords = str.split(" ", 2);
		System.out.println("split string is : " +Arrays.toString(words));
		System.out.println("split after two char : " +Arrays.toString(afterTwoWords));
		String[] number = str.split(" ");
		System.out.println(Arrays.toString(number));
		
	}

}
