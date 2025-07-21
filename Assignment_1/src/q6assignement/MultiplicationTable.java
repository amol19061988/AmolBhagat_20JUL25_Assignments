package q6assignement;

public class MultiplicationTable {

	public static void main(String[] args) {

		MultiplicationTable result = new MultiplicationTable();
		result.printTable(5);

	}

	public void printTable(int num) {

		System.out.println("Printing Table of Number " + num);

		for (int p = 1; p <= 10; p++) {
			int ans = 0;
			ans = (num * p);

			System.out.println("  " + ans);

		}

	}

}
