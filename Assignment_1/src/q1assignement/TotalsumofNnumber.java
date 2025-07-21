package q1assignement;

//Q1. Write a non-static method “getSum(int N)” to calculate the sum from 1 to N numbers where N is the argument.

public class TotalsumofNnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalsumofNnumber add = new TotalsumofNnumber(); // Object is created for the calling non static method.
		add.getsum(5);
		// ----------------------------------------------------
	//	totalsum add1 = new totalsum();
		add.getsum1(3);

	}

	public void getsum(int N) { // Here I have used with arguments
		int ans = 0; // declared local vairable

		for (int b = 0; b <= N; b++) {
			ans = ans + b;

		}

		System.out.println("Following  is the addition of 1 to " + N + " Number");

		System.out.println(" *********  ");
		System.out.println("Total sum of 1 to " + N + " Number" + "= " + ans);

		System.out.println("  ===========  ");

	}

	public int getsum1(int NUM) { // Here i have used with argument and with return value using while loop
		int ans = 0; // declared local vairable
		int b = 0;

		while (b <=NUM ) {
		
			        ans = ans + b;
			        b++;
			   

		}

		 
		
	System.out.println("Following  is the addition of 1 to " + NUM + " Number");

		System.out.println(" *********  ");

		System.out.println("Total sum of 1 to " + NUM+ " Number" + "= " +ans );

		return ans;

	}

}
