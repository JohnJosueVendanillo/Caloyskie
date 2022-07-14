package bankAccountsPackage;

/**
 * Java Course 3, Module 2 - Hands-on Assignment 2: Java Collection Framework (Graded)
 * 
 * Bank Accounts
 *
 * @author John Josue Vendanillo
 * 
 * 
 */
public abstract class BankAccount {
	
	private double balance ;
	public abstract void display(); 

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public BankAccount(double balance) {
		if (balance > 0) {				// set a conditional statement here so that the new balance will not goes negative
			this.balance = balance;
		}
	}
	
	
	
	public void deposit(double amount) {
		if (amount > 0) { 		// deposit method
			balance += amount;
		}
		else {
			balance = 0;		// no deposit occurs
		}
	
	}
	
	
		
	public void withdraw(double amount) {
		
		if (amount > balance ) { // if amount is greater than the current balance the new balance will be 0
			balance = 0;		//no withdrawal occurs
		}
		else {
			balance -= amount; // withdrawal occurs
		}
	}

}
