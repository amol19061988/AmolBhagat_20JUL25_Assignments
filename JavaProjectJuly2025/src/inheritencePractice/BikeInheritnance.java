package inheritencePractice;

public class BikeInheritnance {

	// Properties/Attributes:
	int height = 80;
	int width;
	int weight;
	int num1;

	public BikeInheritnance(int height, int width, int weight) // Construtor
	{

		System.out.println("Construt = " + this.height);// Here i am calling non static variable using this keyword;
		System.out.println("Construt = " + width);
		System.out.println("Construt = " + weight);
	}

	public BikeInheritnance(int width) // Construtor
	{

		System.out.println("Construt = " + width);// Here i am calling non static variable using this keyword;

	}

	public BikeInheritnance() // Construtor without arguments
	{

		System.out.println("Construt = Amol" + num1);// Here i am calling non static variable using this keyword;

	}

	public void heightcal() {
		System.out.println("Height Calculated");

	}

	public void widthcal() {
		System.out.println("Width Calculated");

	}

	public void weightcal() {
		System.out.println("Weight Calculated");

	}

	public void Color() {

		System.out.println("Bike colory is Black");
	}

	public static void main(String[] args) {

		BikeInheritnance result = new BikeInheritnance(15, 10, 50); // OBeject creation
		result.heightcal();
		result.widthcal();
		result.weightcal();
	BikeInheritnance result1 = new BikeInheritnance(850);
	BikeInheritnance result3 = new BikeInheritnance();
	
	}

}
