package sarmabaruaabhigyan_OOP_03;

//Creating the account class
public class Account {
	
	//Considering two variables for the account number and the account balance
	int accountNumber;
	double balance;
	
	//generating the constructors for the account number and the account balance
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	//Method for the deposit
	public void depositFunds(double deposit) {
		
		//Considering the deposit to be invalid, if it is less than or equals to '0'
		if(deposit<=0) {
			System.out.println("Invalid deposit amount. Please try again.");
		}
		else {
			this.balance += deposit;
		}
	}
	
	//Method for the withdrawal
	public void withdrawFunds(double withdraw) {
		//Considering the withdrawal to be invalid, if it is less than or equals to '0', or more than the total account balance
		if(withdraw<=0 || withdraw>balance) {
			System.out.println("Invalid withdraw amount. Please try again.");
		}
		else {
			this.balance -= withdraw;
		}
	}
	
}
