package sarmabaruaabhigyan_OOP_03;

//Creating the test class "Bank"
public class Bank {

	//Main method
	public static void main(String[] args) {
		
		//Creating an object A1 to test the Account class and setting an account number
		Account A1 = new Account(3010048);
		
		//Testing the depositFunds method of the Account class
		A1.depositFunds(1000);
		System.out.println("Deposited amount for A1 = 1000 euro");
		System.out.println("Updated account balance against the account number '"+A1.accountNumber+"' is = "+A1.balance+" euro");
		System.out.println();		//Gap for the next test result
		
		//Testing with the deposit amount less than or equals to 0
		System.out.println("If deposite amount for A1 = -10 euro");
		A1.depositFunds(-10);
		System.out.println();		//Gap for the next test result		
		
		//Testing with the withdraw method of the Account class
		A1.withdrawFunds(400);
		System.out.println("Withdrawal amount for A1 = 400 euro");
		System.out.println("After the withdrawal, the updated account balance against the account number '"+A1.accountNumber+"' is = "+A1.balance+" euro");
		System.out.println();		//Gap for the next test result
		
		//Testing with the withdraw amount less than or equals to 0
		System.out.println("If withdraw amount for A1 = -10 euro");
		A1.withdrawFunds(-10);
		System.out.println();		//Gap for the next test result
		
		//Creating an object A2 to test the SavingsAccount class and setting an account number
		SavingsAccount A2 = new SavingsAccount(1234567);
		
		//Testing with depositFunds method of the SavingsAccount class
		A2.depositFunds(700);
		System.out.println("Deposited amount for A2 = 700 euro");
		System.out.println("The interest rate is = "+A2.interestRate);		//Displaying the interest rate
		System.out.println("Savings account balance for A2 against the account number '"+A2.accountNumber+"' = "+A2.balance+" euro");
		System.out.println();		//Gap for the next test result
		
		//Creating an object A3 to test the CurrentAccount class and setting an account number
		CurrentAccount A3 = new CurrentAccount(7654321);
		
		//Testing the CurrentAccount class and passing 800 euro in depositFunds of the Account class
		A3.depositFunds(800);
		System.out.println("Deposited amount for A3 = 800 euro");
		System.out.println("Overdraft limit = "+A3.overdraftLimit+" euro");
		
		//Taking out 900 euro from the account and testing the same
		A3.withdrawFunds(900);
		System.out.println("Withdrawn by A3 = 900 euro");
		System.out.println("Current account balance for A3 against the account number '"+A3.accountNumber+"' = "+A3.balance+" euro");
		System.out.println();		//Gap for the next test result
		
		//Testing the withdrawFunds for a withdrawal of amount, which is less than or equal to '0'
		System.out.println("If withdraw amount is = -10 euro");
		A3.withdrawFunds(-10);
		System.out.println();		//Gap for the next test result
		
		//Testing the withdrawFunds for a withdrawal of amount, which will result the amount to be less than the overdraft limit of -200
		System.out.println("If withdraw amount is = 300 euro");
		A3.withdrawFunds(300);
		
	}

}
