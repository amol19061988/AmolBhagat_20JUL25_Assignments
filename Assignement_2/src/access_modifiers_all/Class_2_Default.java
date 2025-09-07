package access_modifiers_all;

class Class_2_Default {

	public void newdeafultmethod() {
		System.out.println("Defulat Class Method Running");
	}

	public static void main(String[] args) {

		System.out.println("Running default class2 ");
		System.out.println("Calling Method from Public class here ");

		Class_1_Public result1 = new Class_1_Public();// Created object for calling other class method within same
														// package;

		result1.newpublicmethod(); // Calling Method from other class

	}

}
