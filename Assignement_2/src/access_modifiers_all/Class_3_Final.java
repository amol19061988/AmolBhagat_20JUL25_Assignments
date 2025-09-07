package access_modifiers_all;

public  class Class_3_Final {

	
	
	public void m1 () {
		
		System.out.println("Class_3_Final");
	}
	public static void main(String[] args) {

		{
			System.out.println("Final Class is Running");

			Class_2_Default result3 = new Class_2_Default();
			System.out.println("Withing same pakage defualt clas  Calling Here defulat class method");

			result3.newdeafultmethod();
		}

	}

}
