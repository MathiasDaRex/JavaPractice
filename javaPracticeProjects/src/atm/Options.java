package atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Options extends Account{

	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException {
		
		int x = 1;
		do {
			try {
				data.put(1234, 4321);
				data.put(9999, 8888);
				
				System.out.println("Welcome to the ATM machine!");
				System.out.println("Enter your ID: ");
				setCustomerId(sc.nextInt());
				
				System.out.println("Enter your PIN: ");
				setPinNum(sc.nextInt());
				
			} catch (Exception e) {
				System.out.println("\n" + "Invalid characters. Write only numbers please+" + "\n");
				x = 2;
			}
			
			int cID = getCustomerId();
			int cPIN = getPinNum();
			if(data.containsKey(cID) && data.get(cID) == cPIN) {
				getAccountType();
			} else {
				System.out.println("Wrong ID or PIN");
				System.out.println("Please enter the right data.");
				System.out.println();
				getLogin();
			}
			
		} while (x == 1);
		
	}

	private void getAccountType() {
		System.out.println("Select the Account you want to acces: ");
		System.out.println(" Type 1 - Checking account");
		System.out.println(" Type 2 - Savings account");
		System.out.println(" Type 3 - Exit");
		
		int selected = sc.nextInt();
		switch (selected) {
		case 1:
			getChecking();
			break;
		case 2:
			getSavings();
			break;
		case 3:
			System.out.println("Thank you for using this ATM machine. \n");
			System.out.println("Have a nice day!");
			break;
		default:
			System.out.println("\n Invalid choice! \n");
			break;
		}
	}

	private void getSavings() {
		System.out.println(" Saving account: ");
		System.out.println(" Type 1 - View balance");
		System.out.println(" Type 2 - Withdraw  funds");
		System.out.println(" Type 3 - Deposit funds");
		System.out.println(" Type 4 - Exit");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println(" Checking account balance: "+ df.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using this ATM machine. \n");
			System.out.println("Have a nice day!");
			break;

		default:
			System.out.println("\n Invalid choice! \n");
			getAccountType();
			break;
		}
		
	}

	private void getChecking() {
		System.out.println(" Checking account: ");
		System.out.println(" Type 1 - View balance");
		System.out.println(" Type 2 - Withdraw  funds");
		System.out.println(" Type 3 - Deposit funds");
		System.out.println(" Type 4 - Exit");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println(" Checking account balance: "+ df.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();;
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using this ATM machine. \n");
			System.out.println("Have a nice day!");
			break;
		default:
			System.out.println("\n Invalid choice! \n");
			getAccountType();
			break;
		}
		
	}
	
}
