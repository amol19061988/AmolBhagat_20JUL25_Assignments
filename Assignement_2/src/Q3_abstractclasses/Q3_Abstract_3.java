package Q3_abstractclasses;

public class Q3_Abstract_3 extends Q3_Abstract_2 {

	@Override
	public void animalsleeping() {
		//
		System.out.println("Dog is sleeping");

	}

	// Here at the implementation time method is getting overridden from class 1 to
	// 3 because inheritance is there with abstract class of 2

	protected void allanimal() {

		System.out.println("All Anilmal is enjoying hrere");
	}

	public static void main(String[] args) {

		Q3_Abstract_3 result = new Q3_Abstract_3();

		result.animaleating();
		result.animalrunning();
		result.animalsleeping();
		result.allanimal();

	}

}
