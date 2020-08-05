package sarmabaruaabhigyan_OOP_03;

//Creating the current account class
public class CurrentAccount extends Account {
	
	//taking the overdraft limit to be 200
	double overdraftLimit = -200;
	
	//Constructor for the inheritance
	public CurrentAccount(int accountNumber) {
		super(accountNumber);
	}
	
	//Method to calculate the withdrawal amount and the updated balance
	public void withdrawFunds(double withdraw) {
		
		//Considering the updated balance to be invalid, if it is less than overdraft limit
		if(super.balance - withdraw < overdraftLimit) {
			System.out.println("Invalid withdrawal amount. Exceeding overdraft limit.");
		}
		//Considering the withdrawal amount to be invalid, if it is less than or equals to '0'
		else if (withdraw <= 0) {
			System.out.println("Invalid withdrawal amount. Thw withdrawal amount can not be less than or equals to '0'");
		}
		else {
			super.balance = super.balance - withdraw;
		}
	}
	
}
