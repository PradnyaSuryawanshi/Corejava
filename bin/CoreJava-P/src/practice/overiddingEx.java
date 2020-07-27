package practice;

class Dog {
	public static void eat() {
		System.out.println("dog is eating");
	}
}

class Cat extends Dog {
	public static void eat() {
		System.out.println("cat is eating");
	}
}

public class overiddingEx {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		c.eat();
		d.eat();
	}

}
