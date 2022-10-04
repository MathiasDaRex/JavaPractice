package atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class Account {

	private int customerId;
	private int pinNum;
	private double checkingBalance = 0;
	private double savingBalance = 0; 
	private Options opt;
	
	
	Scanner sc = new Scanner(System.in);
	DecimalFormat mf = new DecimalFormat("'$'###,##0.00");
	
	
	public Account(int customerId, int pinNum) {
		super();
		this.customerId = customerId;
		this.pinNum = pinNum;
	}

	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public int getPinNum() {
		return pinNum;
	}
	
	public void setPinNum(int pinNum) {
		this.pinNum = pinNum;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking account balance: " + mf.format(checkingBalance));
		System.out.print("Amount you want to withdraw from checking account :");
		double amount = sc.nextDouble();
		if((checkingBalance - amount) > 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New checking account balance: " + mf.format(checkingBalance));
		} else {
			System.out.println("Amount must be greater than zero!" + "\n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving account balance: " + mf.format(savingBalance));
		System.out.print("Amount you want to withdraw from saving account :");
		double amount = sc.nextDouble();
		
		if((savingBalance - amount) > 0) {
			calcSavingWithdraw(amount);
			System.out.println("New saving account balance: " + mf.format(savingBalance));
		} else {
			System.out.println("Amount must be greater than zero!" + "\n");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Checking account balance: " + mf.format(checkingBalance));
		System.out.print("Amount you want to deposit to checking account :");
		double amount = sc.nextDouble();
		
		if(checkingBalance >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New checking balance: " + mf.format(checkingBalance));
			
		} else {
			System.out.println("Balance cannot be negative. " + "\n");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving account balance: " + mf.format(savingBalance));
		System.out.print("Amount you want to deposit to saving account :");
		double amount = sc.nextDouble();
		
		if(savingBalance >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New checking balance: " + mf.format(savingBalance));
			
		} else {
			System.out.println("Balance cannot be negative. " + "\n");
		}
	}
	
	public boolean getTransferAmount(int amount) {
		if(getCheckingBalance()>=amount) {
			return true;
		} else {
			return false;
		}
	}
	
	public void getTransferInput(Account acc, int amount, int idTo, List<Account> accList) throws IOException {
	Boolean x = false;
	int y = 0;
	System.out.print("Please enter the amount you want to transfer: ");
	amount = sc.nextInt();
	if(acc.getTransferAmount(amount)) {
		System.out.print("Enter the ID you want to transfer funds for: ");
		idTo = sc.nextInt();
		System.out.println("Amount: "+amount + " acc funds: "+acc.getCheckingBalance() + "id to: "+ idTo);
		for (Account item : accList) {
			if(item.getCustomerId()==idTo && y==0) {
				x = true;
				y++;
				acc.calcCheckingWithdraw(amount);
				item.calcCheckingDeposit(amount);
				System.out.println("Succesfully transfered "+mf.format(amount)+" to "+ idTo);
				System.out.println("New balance: "+acc.getCheckingBalance());
			}
			
		}
		if(!x) {
			System.out.println("Invalid transfer id! ");
			opt.getChecking(acc);
		}
	} else {
		System.out.println("You don't have enough money!");
		opt.getAccountType(acc);
	}
	opt.getAccountType(acc);
		
	}
	
}
