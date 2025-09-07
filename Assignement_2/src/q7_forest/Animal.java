package q7_forest;

//Question 7 :

//Create a superclass Animal and subclasses Dog, Cat, Cow. Override the 
//makeSound() method. Loop through a list of Animal and invoke 
//makeSound() using polymorphic references. 
public class Animal {

	public void makeSound() {

		System.out.println("Making sound of Animal Super Class");
	}

	public static void main(String[] args) {

	//	Animal newvar = new Animal();
//		newvar.makeSound();
		
		//With reference of all animal classes here called all other values from other class

		Animal Animals[] = { new Dog(), new Cat(), new cow() };

		for (Animal animal : Animals) {

			animal.makeSound();

		}
	}

}
