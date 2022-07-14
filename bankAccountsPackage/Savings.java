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

public class Savings extends BankAccount{
	
	private double intRate;
	
	public Savings(double balance,double intRate) {
		super(balance);
		this.intRate = intRate;
	}

	public double getIntRate() {
		return intRate;
	}
	
	
	public void addInterest(){
		double interest= getBalance()*getIntRate();
		setBalance(interest+getBalance());
	}
	
	@Override
	public void display() {
		System.out.println("Savings account balance = $" + getBalance());
		
	}

}
