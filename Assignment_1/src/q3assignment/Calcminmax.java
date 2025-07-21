package q3assignment;

//. Create two static methods in 1 class ‘getMaxValue()’ and the 
//‘getMinValue()’ to print the maximum and minimum numbers 
//respectively among three numbers taken as arguments for both 
//methods
public class Calcminmax {

	public static void main(String[] args) {
		Calcminmax minmax = new Calcminmax();

		int a = 1;
		int b = 10;
		int c = 100;
		minmax.maxvalgetMaxValue(a, b, c);

		minmax.minvalgetMaxValue(900, 55, 100);

	}

	public int maxvalgetMaxValue(int a, int b, int c) {
		int ans = a;
		if (a <= b) {
			ans = b;

			if (ans <= c) {
				ans = c;
			}
		}
		System.out.println("Max number of given values= " + ans);

		return ans;
	}

	public int minvalgetMaxValue(int a, int b, int c) {
		int ans = a;
		if (a > b) {
			ans = b;

			if (ans > c) {
				ans = c;
			}
		}
		System.out.println("Min number of given values= " + ans);

		return ans;
	}
}
