package q5_Multilevel_Contructor_Behave;

public class Q5_Class2 extends Q5_Class_1 {

	public Q5_Class2() {

		super(100);
		super.process1(); // Using super keyword here calling other class method and parameters , constructor is calling.

		System.out.println("Child Constructor Is running");
	}

	public void process2() {
		System.out.println("Child Function from Class 2 process 2 calling ");

	}

	public static void main(String[] args) {
		System.out.println("Its Main Parent Method class is running");

		Q5_Class2 info = new Q5_Class2();
		info.process2();

	}
	


}
