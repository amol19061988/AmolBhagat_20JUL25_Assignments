package q2superandsubclassinheritence;

//Question
//Can private methods be inherited? Show this through a method in the 
//superclass and a method with the same name in the subclass. 

// we cannot Inherits the private method in subclass and it will not overridden because those provide method will be not visible to subclass 
// Also we can create the same name method in subclass also but that will consider as separate method it will not overridden 

public class Q2_subclass extends Q2_super_class {

	private void summision() {

		System.out.println("Subclass summsion method calling");
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Subclass is Running");

		Q2_subclass result = new Q2_subclass();

		result.summision();

	}

}
