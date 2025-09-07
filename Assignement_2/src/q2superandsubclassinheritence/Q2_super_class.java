package q2superandsubclassinheritence;
//Question

//Can private methods be inherited? Show this through a method in the 
//superclass and a method with the same name in the subclass. 

public class Q2_super_class {

	private void summision() {

		int a = 100;
		int b = 5000;
		double c = (a + b);
		System.out.println(c);
	}

	public static void main(String[] args) {

		Q2_super_class result = new Q2_super_class();

		System.out.println("Super class is Running");

		result.summision();
	}

}
