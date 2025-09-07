package q8_banking;

//Q8.Create a parent class Account and subclasses like SavingsAccount, 
//FixedDepositAccount. Implement interest calculation differently in each 
//subclass. Instantiate and print account details. 

public class Account {

	public static void main(String[] args) {

		System.out.println("Super Class");

		SavingsAccount interestcalc = new SavingsAccount();

		interestcalc.interestcal();

		FixedDepositAccount interestcalc1 = new FixedDepositAccount();

		interestcalc1.interestcal();

	}

}
