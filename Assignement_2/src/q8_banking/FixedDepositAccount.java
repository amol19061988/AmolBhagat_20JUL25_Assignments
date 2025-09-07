package q8_banking;

public class FixedDepositAccount {

	public void interestcal() {

		int days = 20;
		int rate = 6;
		int principal = 8000;

		double result = (principal * rate / 36500.0) * days;

		System.out.printf("Fixed Deposit Interest Calculation - %.2f%n", result);
	}

	public static void main(String[] args) {
		FixedDepositAccount newfix = new FixedDepositAccount();
		newfix.interestcal();
	}
}