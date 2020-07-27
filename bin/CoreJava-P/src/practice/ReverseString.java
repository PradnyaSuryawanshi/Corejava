package practice;

public class ReverseString {

	public static void main(String[] args) {
		String str= "Pradnya";
		StringBuilder str2= new StringBuilder();
		str2.append(str);
		str2=str2.reverse();
		System.out.println("Reverse String : " +str2);

	}

}
