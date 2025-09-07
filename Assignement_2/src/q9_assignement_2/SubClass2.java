package q9_assignement_2;

public class SubClass2 extends Superclass_1 {

	public static void main(String[] args) {

		SubClass2 newresult = new SubClass2();

		// Here within same package even if method is protected also we can extend and
		// use. but if it we tried in
		// other package those protected methods we cannot access.
		newresult.newmethod1();

	}

}
