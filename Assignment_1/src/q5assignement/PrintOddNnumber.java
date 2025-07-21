package q5assignement;
//Q5.5. Write a static method to print odd numbers from 1 to 50.  

public class PrintOddNnumber {

	public static void main(String[] args) {

		PrintOddNnumber.Oddnumberrange();

	}

	public static void Oddnumberrange() {
		int j = 2;
		int k = 50;

		for (j = 1; j <= k; j++) {
			int ans = j % 2;
			if (ans != 0) {
				System.out.println("Odd Number 1 to 50 " + j);
			}
		}
	}

}
