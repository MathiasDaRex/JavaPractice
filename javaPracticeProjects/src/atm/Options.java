package atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Options {

	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
//	List<Account> accList = new ArrayList<Account>(); 
	
	Account acc1 = new Account(1234, 4321);
	Account acc2 = new Account(4321, 1234);
	Account acc3 = new Account(2222, 2222);
	Account acc4 = new Account(3333, 3333);
	Account acc5 = new Account(4444, 4444);
	Account acc6 = new Account(5555, 5555);
	
	
	public void getLogin() throws IOException {
		
		List<Account> accList = new ArrayList<Account>();
		accList.add(acc1);
		accList.add(acc2);
		accList.add(acc3);
		accList.add(acc4);
		accList.add(acc5);
		accList.add(acc6);
		int x = 0;
		int y = 0;

			try {

				System.out.println("Welcome to the ATM machine!");
				System.out.println("Enter your ID: ");
				int tempId = sc.nextInt();
				for (Account item : accList) {
					if(tempId == item.getCustomerId()) {
						System.out.println("Enter your PIN: ");
						x++;
						int tempPin = sc.nextInt();
						for (Account item2 : accList) {
							if(tempPin == item2.getPinNum()) {
								y++;
							}
						}
					}
					
				}
				if(x==1 && y==1) {
					for (Account item : accList) {
						if(item.getCustomerId() == tempId) {
							getAccountType(item);
						}
					}
				} else {
					System.out.println("Wrong credentials...please try again");
					getLogin();
				}
			} catch (Exception e) {
				System.out.println("\n" + "Invalid characters. Write only numbers please!" + "\n");
				getLogin();
			}
	}

	private void getAccountType(Account acc) throws IOException {
		System.out.println("Select the Account you want to acces: ");
		System.out.println(" Type 1 - Checking account");
		System.out.println(" Type 2 - Savings account");
		System.out.println(" Type 3 - Exit");
		
		int selected = sc.nextInt();
		switch (selected) {
		case 1:
			getChecking(acc);
			break;
		case 2:
			getSavings(acc);
			break;
		case 3:
			System.out.println("Thank you for using this ATM machine. \n");
			System.out.println("Have a nice day!");
			getLogin();
			break;
		default:
			System.out.println("\n Invalid choice! \n");
			break;
		}
	}

	private void getSavings(Account acc) throws IOException {
		System.out.println(" Saving account: ");
		System.out.println(" Type 1 - View balance");
		System.out.println(" Type 2 - Withdraw  funds");
		System.out.println(" Type 3 - Deposit funds");
		System.out.println(" Type 4 - Exit");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println(" Saving account balance: "+ df.format(acc.getSavingBalance()));
			getAccountType(acc);
			break;
		case 2:
			acc.getSavingWithdrawInput();
			getAccountType(acc);
			break;
		case 3:
			acc.getSavingDepositInput();
			getAccountType(acc);
			break;
		case 4:
			System.out.println("Thank you for using this ATM machine. \n");
			System.out.println("Have a nice day!");
			getLogin();
			break;

		default:
			System.out.println("\n Invalid choice! \n");
			getAccountType(acc);
			break;
		}
		
	}

	private void getChecking(Account acc) throws IOException {
		System.out.println(" Checking account: ");
		System.out.println(" Type 1 - View balance");
		System.out.println(" Type 2 - Withdraw  funds");
		System.out.println(" Type 3 - Deposit funds");
		System.out.println(" Type 4 - Exit");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println(" Checking account balance: "+ df.format(acc.getCheckingBalance()));
			getAccountType(acc);
			break;
		case 2:
			acc.getCheckingWithdrawInput();
			getAccountType(acc);
			break;
		case 3:
			acc.getCheckingDepositInput();;
			getAccountType(acc);
			break;
		case 4:
			System.out.println("Thank you for using this ATM machine. \n");
			System.out.println("Have a nice day!");
			break;
		default:
			System.out.println("\n Invalid choice! \n");
			getAccountType(acc);
			break;
		}
		
	}
	
}
