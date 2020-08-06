package sarmabaruaabhigyan_OOP_03;

//Creating the savings account class
public class SavingsAccount extends Account {
	
	//considering the interest rate to be 4%
	double interestRate = 0.04;				//As 4% = 0.04
	
	//Constructor for the inheritance
	public SavingsAccount(int accountNumber) {
		super(accountNumber);
	}
	
	//Method to calculate the balance, after calculating the interest rate and the updated balance
	public void savingsBalance() {
		super.balance += super.balance * this.interestRate;
	}
	
}