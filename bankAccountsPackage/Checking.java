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

public class Checking extends BankAccount {

	public Checking(double balance) {
		super(balance);
		
	}
	// checking method/  new balance = current balance - writeAcheck amount + service Fee (1) 
	public void writeAcheck(int amount) {
		double serviceFee=1;
		setBalance(getBalance() - (amount+serviceFee));		// write a check 		
	}
	
	@Override
	public void display() {
		System.out.println("Checking account balance = $" + getBalance() );
		
	}


	


	
}
