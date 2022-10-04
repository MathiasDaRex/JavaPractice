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
	
	Account acc1 = new Account(1234, 4321);
	Account acc2 = new Account(4321, 1234);
	Account acc3 = new Account(2222, 2222);
	Account acc4 = new Account(3333, 3333);
	Account acc5 = new Account(4444, 4444);
	Account acc6 = new Account(5555, 5555);
	public List<Account> accList = new ArrayList<Account>();
	int idTo;
	int amount;

	
	
	public void getLogin() {
		Scanner scc = new Scanner(System.in);
		accList.add(acc1);
		accList.add(acc2);
		accList.add(acc3);
		accList.add(acc4);
		accList.add(acc5);
		accList.add(acc6);
		Boolean in = false;
		int tempId = 0;
		int tempPin = 0;
		int x = 0;
		
		try {
			while(!in) {
				System.out.print("Enter your ID: ");
				tempId = scc.nextInt();
				System.out.println("X"+tempId);
				System.out.print("Enter your PIN: ");
				tempPin = scc.nextInt();
				System.out.println("Y"+tempPin);
				for (Account item : accList) {
					if(item.getCustomerId() == tempId && item.getPinNum() == tempPin) {
						System.out.println("X :"+tempId +" Y "+item.getCustomerId()+" XX: "+tempPin+" YY: "+item.getPinNum());
						in = true;
						getAccountType(item);
						x++;
					} 
				}
				if(x==0) {
					System.out.println("Wrong credentials...please try again");
					getLogin();
				}
			} 
			
		} catch (Exception e){
				System.out.println("\n" + "Invalid characters. Write only numbers please!" + "\n");
				getLogin();
		}
		scc.close();
	}

	public void getAccountType(Account acc) throws IOException {
		System.out.println();
		System.out.println("Hi "+acc.getCustomerId());
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
		System.out.println("Saving account: ");
		System.out.println(" Type 1 - View balance");
		System.out.println(" Type 2 - Withdraw  funds");
		System.out.println(" Type 3 - Deposit funds");
		System.out.println(" Type 4 - Exit");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Saving account balance: "+ df.format(acc.getSavingBalance()));
			System.out.println();
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

	public void getChecking(Account acc) throws IOException {
		System.out.println("Checking account: ");
		System.out.println(" Type 1 - View balance");
		System.out.println(" Type 2 - Withdraw  funds");
		System.out.println(" Type 3 - Deposit funds");
		System.out.println(" Type 4 - Transfer funds");
		System.out.println(" Type 5 - Exit");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Checking account balance: "+ df.format(acc.getCheckingBalance()));
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
			getTransferData(acc);
			break;
		case 5:
			System.out.println("Thank you for using this ATM machine. \n");
			System.out.println("Have a nice day!");
			break;
		default:
			System.out.println("\n Invalid choice! \n");
			getAccountType(acc);
			break;
		}
	}
	
	private void getTransferData(Account acc) throws IOException {
		Boolean enoughMoney = false;
		System.out.print("Please enter the amount you want to transfer: ");
		amount = sc.nextInt();
		if(acc.getTransferAmount(amount)) {
			enoughMoney = true;
			if(enoughMoney) {
				System.out.print("Enter the ID you want to transfer funds for: ");
				System.out.println(" TRŰ? "+enoughMoney);
				int y = 0;
				// System.out.print("Enter the ID you want to transfer funds for: ");
				int idTo = sc.nextInt();
				for (Account item : accList) {
				System.out.println("Amount: "+amount + " acc funds: "+acc.getCheckingBalance() + "id to: "+ idTo + " ell: "+ item.getCustomerId());
					if(item.getCustomerId()==idTo ) {
						//x = true;
						y++;
						acc.calcCheckingWithdraw(amount);
						item.calcCheckingDeposit(amount);
						System.out.println("Succesfully transfered "+df.format(amount)+" to "+ idTo);
						System.out.println("New balance: "+acc.getCheckingBalance());
						getAccountType(acc);
					} 
				}
				if(y==0) {
					System.out.println("Wrong id");
					getAccountType(acc);
				}
			}
		} else {
			System.out.println("You don't have enough money for this transaction.");
			getAccountType(acc);
		}	
	}
	
}
