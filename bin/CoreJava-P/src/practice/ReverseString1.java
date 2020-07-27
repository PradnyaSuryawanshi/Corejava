package practice;

public class ReverseString1 {


	public static void main(String[] args) {
		String str="Pradnya";
		char[] array=str.toCharArray();
		for(int i=array.length-1;i>=0;i--) {
			System.out.print( array[i]);
		}

	}

}
