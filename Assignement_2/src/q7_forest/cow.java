package q7_forest;

public class cow extends Cat {

	public void makeSound() {
		System.out.println("Cow is Making sound");
	}

	public static void main(String[] args) {

		// Created reference object with same class.
		cow varw4 = new cow();

		varw4.makeSound();

		// With inheritance super class object stored with child reference
		Cat Newvar6 = new cow();
		Newvar6.makeSound();

		// Created super class object and reference object both are same from super
		// class
		Cat newvar5 = new Cat();
		newvar5.makeSound();

		/// Here i Have called Super and Parent class for inheritence
		Animal newrrr = new Dog();

		newrrr.makeSound();

		Animal hh = new Animal();
		hh.makeSound();

		// System.out.println(hh);

	}

}
