package q5_Multilevel_Contructor_Behave;

public class Q5_Class_1 {

	// Default constructor calling here
	public Q5_Class_1() {

	}

	public Q5_Class_1(int a) {

		System.out.println(a);
	}

	public void process1() {

		final double n = 100.50;
		double m = 8000.89;

		double result = n * m;

		System.out.println("Process1 from Classs 1 --- " + result);
	}

	public static void main(String[] args) {
		System.out.println("Its Main Parent Method class is running");

		Q5_Class_1 info = new Q5_Class_1();
		info.process1();

	}

}
