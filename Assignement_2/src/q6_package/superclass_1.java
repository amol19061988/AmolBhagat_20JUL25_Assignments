package q6_package;

//Question 6 :What issues might arise if a superclass has overloaded constructors but no default constructor?
// Here other constructors are overloaded but default constructor is not declared 
public class superclass_1 {

	public superclass_1(int a) {
		System.out.println("Stytem  Single param Super class");
	}

	public superclass_1(int a, int b) {
		System.out.println("Dual Super class" + a + b);
	}

	// Default constructor
	// public superclass_1() {
	// }

	public static void main(String[] args) {

		System.out.println("122");
		int newvariable = 2323;

		System.out.println(newvariable);

		// superclass_1 abcd = new superclass_1(0);
		// superclass_1 abcd1 = new superclass_1(200, 500);

	}

}
