package inheritencePractice;

public class BikeInheritChild extends BikeInheritnance {

	int newvar = 5000;

	public BikeInheritChild() {
		super(100, 2, 2); // Explicitly calling here Construcor
	
	}

	//public BikeInheritChild() {

		//super(2); // Explicitly calling here Construcor

	//}

	//public BikeInheritChild() {

		//super(); // Explicitly calling here Construcor

	//}

	public void newmethod() {
		System.out.println(newvar);
		System.out.println(
				" Direct calling parent class non static vairable hereusing Super Keyword   --- " + super.height);
	}

	public static void main(String[] args) {

		BikeInheritChild me = new BikeInheritChild();
		System.out.println("Child/Parent/Sub Running= " + me.height);

		BikeInheritChild result = new BikeInheritChild();
		result.newmethod();
		
		BikeInheritnance result1 = new BikeInheritnance(100);
		BikeInheritnance result2 = new BikeInheritnance();

	}
}
