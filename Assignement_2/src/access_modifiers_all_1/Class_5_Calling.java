package access_modifiers_all_1;

import access_modifiers_all.Class_1_Public;

public class Class_5_Calling {

	public static void main(String[] args) {

		System.out.println("Access Modifiers Different Pakage 1");
		System.out
				.println("Calling here other pakage Mehood becuase that class access is public and method also public");
		Class_1_Public result2 = new Class_1_Public(); // Creating object for different package where other class is
														// public declared we can call that class everywhere in project.
		result2.newpublicmethod();

		// Here I am trying to access default class in different package.
		// Class_2_Default
		// We cannot call default class in different package.

	}

}
