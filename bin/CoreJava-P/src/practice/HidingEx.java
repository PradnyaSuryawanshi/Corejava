package practice;

class Parent {
	int age = 34;
}

class Child extends Parent {
	int age = 15;

	public void age() {
		System.out.println("Child age is : " + this.age);
		System.out.println("Child age is : " + age);
		System.out.println("Parent age is : " + super.age);

	}
}

public class HidingEx {

	public static void main(String[] args) {
		Child c = new Child();
		c.age();
		
		
	}

}
