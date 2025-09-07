package access_modifiers_all;

public class Class_1_Public {

	public  void newpublicmethod() {

		System.out.println("NewPublicMethod");
	}

	public static void main(String[] args) {
		System.out.println("Public Modifier Class Running");

		Class_1_Public result = new Class_1_Public();
		result.newpublicmethod();
	}

}
