package access_modifiers_all_1;

import access_modifiers_all.*;

public class Subclass_diff_package extends Class_3_Final {

	public static void main(String[] args) {

		System.out.println("Subclass");
		
		
	//	Using Inheritance from other package  here called other non static
		//function using created parent class object called that function.
		Class_3_Final result4 = new Class_3_Final();
		System.out.println("\"Called here function from parent using Parenet object\"");
	 
		result4.m1();
		
System.out.println("      ");
	
		
		//Using child class i have called here same obecjt creation for sub class
		Subclass_diff_package result5 = new Subclass_diff_package();
		System.out.println("Called here function from parent using child object");
		result5.m1();
		
	}
}
