package bankAccountsPackage;

import java.util.ArrayList;

/**
 * Java Course 3, Module 2 - Hands-on Assignment 2: Java Collection Framework (Graded)
 * 
 * Bank Accounts
 *
 * @author John Josue Vendanillo
 * 
 * 
 */

public class BankAccountsDriver {

	public static void main(String[] args) {
		
		BankAccount[] accounts = new BankAccount[100];
		accounts[0] = new Savings(1100,.05);
		accounts[0].deposit(100);
		accounts[0].withdraw(200);
		((Savings)accounts[0]).addInterest();
		
		accounts[1]= new Checking(-100);
		accounts[1].deposit(50);
		
		accounts[2]= new Checking(200);
		accounts[2].withdraw(210);
		accounts[2].deposit(100);
		((Checking)accounts[2]).writeAcheck(50);

		for (int i=0;i<accounts.length && accounts[i] !=null;i++) {
			accounts[i].display();
		}
	}
}
