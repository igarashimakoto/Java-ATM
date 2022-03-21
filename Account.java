package System;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account extends Client {
	
//	private int customerNumber;
//	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyformat = new DecimalFormat("'$'###,##0,00");
	
	/*set customer number */
	
//	public int setCustomerNumber(int customerNumber) {
//		this.customerNumber = customerNumber;
//		return customerNumber; 
//	}
//	
//	/*get the customer number */
//	
//	public int getCustomerNumber( ) {
//		return customerNumber;
//	}
//	
//	/*set pin number */
//	
//	public int setPinNumber(int pinNumber) {
//		this.pinNumber = pinNumber;
//		return pinNumber;	
//	}
//	
//	/*get pin number*/
//	
//	public int getPinNumber() {
//		return pinNumber;
//	}
	
	/*get checking account balance */
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	/*get saving account balance*/
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	/*calculate checking account withdrawal*/
	
	public double calcCheckingWihdraw(double amount) {
		checkingBalance -= amount;
		return checkingBalance;
	}
	
	/*calculate saving account withdrawal*/
	
	public double calcSavingWithdraw(double amount) {
		savingBalance -= amount;
		return savingBalance;
	}
	
	/*calculate checking account deposit */
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance += amount;
		return checkingBalance;
	}
	
	/*calculate saving account deposit */
	
	public double calcSavingDeposit(double amount) {
		savingBalance -= amount;
		return savingBalance;
	}
	
	/*customer checking account withdraw input */
	
	public void getCheckingWithdrawInput() {
		System.out.println("checking account balance: " + moneyformat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking account: ");
		double amount = input.nextDouble();
		
		if (checkingBalance - amount >= 0) {
			calcCheckingWihdraw(amount);
			System.out.println("New checking account balance: " + moneyformat.format(checkingBalance));
		} else {
			System.out.println("balance cannot be negative" + "\n");
		}
		
	}
	
	/*customer saving account withdraw input */
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving account balance: " + moneyformat.format(savingBalance));
		System.out.println("Amount you want to withdraw from Saving Account: ");
		double amount = input.nextDouble();
		
		if (savingBalance - amount >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New saving account balance: " + moneyformat.format(savingBalance));
		} else {
			System.out.println("balance cannot be negative" + "\n");
		}
	}
	
	/*customer checking account deposit input*/
	
	public void getCheckingDepositInput() {
		System.out.println("checking account balance: " + moneyformat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking account: ");
		double amount = input.nextDouble();
		
		if (checkingBalance + amount >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New checking account balance: " + moneyformat.format(checkingBalance));
		} else {
			System.out.println("balance cannot be negative" + "\n");
		}
		
	}
	
	/*customer saving account deposit input*/
	
	public void getSavingDepositInput() {
	System.out.println("saving account balance: " + moneyformat.format(savingBalance));
	System.out.println("Amount you want to deposit on saving account: ");
	double amount = input.nextDouble();
	
	if (savingBalance + amount >= 0) {
		calcSavingDeposit(amount);
		System.out.println("New seving account balance: " + moneyformat.format(savingBalance));
	} else {
		System.out.println("balance cannot be negative" + "\n");
	  }
	}
}
	
