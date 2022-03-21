package System;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account  {
	
	int selection;
	
	Scanner MenuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00 "); 
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	
	/*validating password e login */
	
	public void getLogin() throws IOException {
		int x = 1;
		
		do {
			try {
				data.put(9876543, 9876);
				data.put(898998, 1890);
				
				System.out.println("Welcome to the virtual ATM");
				
				System.out.println("Enter your customer number: ");
				setCustomerNumber(MenuInput.nextInt());
				
				System.out.println("Enter your password: ");
				setPinNumber(MenuInput.nextInt());
			} catch (Exception e) {
				System.out.println("\n" + "Invalid caracter(s). Only numbers allowed. Please try again" + "\n");
				x = 2; 
			}
			for (Entry<Integer, Integer> entry : data.entrySet()) {
				if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType(); 
				}
			}
			System.out.println("\n" + "Wrong costumer number or pin number" + "\n");
		}while (x == 1 );	
	}

	
	
	/* display options after verifying the account */
	
	public void getAccountType() {
		System.out.println("Select the option you want to use:");
		System.out.println("1 - Checking account.");
		System.out.println("2 - Saving account.");
		System.out.println("3 - Bill payment");
		System.out.println("4 - exit.");
		System.out.print("type the number of your choice: ");
		
		
		selection = MenuInput.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
		
		case 2:
			getSaving();
			break;
		
		case 3:
			System.out.println("shuttinf off operations. Thank you for using this ATM");
		
		default:
			System.out.println("\n" + "invalid choice. Please try again" + "\n");
			getAccountType();
		}
	}
	
	/* defining the getCheking */
	
	public void getChecking() {
		System.out.println("account options: ");
		System.out.println("1 - view balance");
		System.out.println("2 - withdraw funds");
		System.out.println("3 - deposit funds");
		System.out.println("4 - Exit");
		System.out.print("type the number of your choice: ");
		
		selection = MenuInput.nextInt();
		
		
		switch (selection) {
		
		case 1:
			System.out.println("Current Account Balance: " + moneyFormat.format(getCheckingBalance()));
			getChecking();
			
		case 2: 
			getCheckingWithdrawInput();
			getChecking();
			
		case 3: 
			getCheckingDepositInput();
			getChecking();
		
		case 4: 
			System.out.println("shuttinf off operations. Thank you for using this ATM");
			
		default:
			System.out.println("\n" + "invalid choice. Please try again" + "\n");
			getChecking();
			
		}
	}
	
	
	/* display saving account menu with selection */
	
	public void getSaving() {
		System.out.println("Saving account:");
		System.out.println("1 - View balance");
		System.out.println("2 - Widraw funds");
		System.out.println("3 - Deposit funds");
		System.out.println("4 - Exit");
		System.out.print("type the number of your choice: ");
		
		selection = MenuInput.nextInt();
		
		switch(selection) {
			case 1:
				System.out.println("saving account balance" + moneyFormat.format(getSavingBalance()));
				getSaving();
				break;
			
			case 2:
				getSavingWithdrawInput();
				getSaving();
				break;
				
			case 3: 
				getSavingDepositInput();
				getSaving();
				break;
				
			case 4:
				System.out.println("shuttinf off operations. Thank you for using this ATM");
				break;
				
			default:
				System.out.println("\n" + "invalid choice" + "\n");
				getSaving();
		}
	} 
}
	

	

