package exception_handling;

import java.io.FileInputStream;

public class Class1 {

	public static void FileInputStream() {

		String Refdata = FileInputStream("D:\\Java-Selinium-Testometer\\GIT-Details.txt");
	}

	public static void main(String[] args) {

		try {

			int a = 100;
			int b = 0;

			int c = a / b;
			System.err.println("Value of C  --" + c);

		}

		catch (ArithmeticException e) {
			System.out.println("Getting A Arethimatic exception");
		}

		finally {

			String s1 = "PQR";

			s1= s1.concat("AMOL");

			System.out.println(s1);
			System.out.println("Finnaly Performing here");
		}

	}

}
