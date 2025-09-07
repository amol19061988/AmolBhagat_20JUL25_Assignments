package q8_banking;

public class SavingsAccount {

	public void interestcal() {

		int days = 20;
		int rate = 5;
		int principle = 50000;

		int result = principle * rate / 36500 * days;

		System.out.println("Savings Interest Calculation - "+ result);
	}

	public static void main(String[] args) {

		SavingsAccount newresult = new SavingsAccount();
		newresult.interestcal();

	}

}
