package q4assignment;

//Q4.Define a class ‘Calculator’ with static methods for basic arithmetic 
// operations like “add(int a, int b), add(double a, double b), subtract(int a,int b),
//and subtract(double a, double b)”. Output should be displayed 
//properly in console in respective data types. 

public class Calculator {

	public static void main(String[] args) {
		int a = 60;
		int b = 20;
		double c = a;
		double d = b;

		// All methods are static so within class calling directly;
		add(a, b); // Here int return type static method passing with arguments;
		subtract(a, b); // Here int return type static method passing with arguments;
		subtract(c, d); // Here Double return type static method passing with arguments;

	}

	public static int add(int a, int b) {

		int ans = a + b;
		System.out.println(" ******************* ");

		System.out.println("Herewith printing int return type Addition method ~~~~~ " + ans);
		return a;

	}

	public static int subtract(int a, int b) {

		int ans = a - b;
		System.out.println(" ******************* ");

		System.out.println("Herewith printing int return type subtract method ~~~~~ " + ans);
		return a;
	}

	public static double subtract(double a, double b) {

		double ans = a - b;

		System.out.println(" ******************* ");

		System.out.println("Herewith printing double return type subtract method ~~~~~ " + ans);

		return a;
	}

}
