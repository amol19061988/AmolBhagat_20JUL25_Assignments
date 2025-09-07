package q6_package;

public class childclass_2 extends superclass_1 {

	// this is constructor 1
	public childclass_2(int a, int b) {
		super(a, b);

	}
	// this is constructor 2

	public childclass_2(int m) {
		super(m);

	}

	// this is default constructor

//public childclass_2() {
	// super();
//	}

	public static void main(String[] args) {

		System.out.println("Main Method Child Class");

		childclass_2 abd = new childclass_2(100, 200);
		childclass_2 abd1 = new childclass_2(200);

		// Here we don't have constructor in super class so we are getting error for
		// compilation "The constructor childclass_2() is undefined"
		// childclass_2 abd11 = new childclass_2();
	}

}
