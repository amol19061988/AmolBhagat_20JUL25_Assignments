package q7_forest;

public class AnilmalSoundClass {

	public static void main(String[] args) {

		Animal Animals[] = { new Dog(), new Cat(), new cow(), new Animal() };

		for (Animal animal : Animals) {

			animal.makeSound();

		}

		Dog Animals1[] = { new Dog(), new Cat(), new cow() };

		for (Dog animal : Animals1) {

			animal.makeSound();

		}
	}
}
