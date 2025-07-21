package q2assignment;

//Q2. Write a non-static method to find largest number from array which is taken as input to the method “getMaxValueFromArray()” 
public class LargeNumberofArray {

	public static void main(String[] args) {

		LargeNumberofArray result = new LargeNumberofArray(); // Create object to call non-static method

		int[] newarr = { 10, 45, 23, 67, 89, 150, 150 };
		result.getMaxValueFromArray(newarr);

	}

	public int getMaxValueFromArray(int[] n) {

		int ans = n[0];
		// int ans = n[10];

		for (int i = 1; i < n.length; i++) {

			if (n[i] > ans) {
				ans = n[i];
			}
		}

		System.out.println("Largest Number " + ans);
		return ans;

	}
}
