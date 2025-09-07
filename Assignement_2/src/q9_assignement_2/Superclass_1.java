package q9_assignement_2;


//Question 9 :Create a superclass with a protected method, extend it in another 
//package, and verify if you can invoke that method directly
public class Superclass_1 {

	protected void newmethod1() {

		System.out.println("Its running protected method here ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Superclass_1 result = new Superclass_1();

		result.newmethod1();
	}

}
