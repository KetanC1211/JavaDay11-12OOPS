package com.bridgelabz;

public class Account {
	static int balance = 10000;
	
	public static int debit(int debitAmount) {
		if (debitAmount>balance) {
			System.out.println("Insufficient Balance to withdraw.\nCurrent balance is "+balance);
			return balance;
		}
		else {
		balance = balance -debitAmount;
		System.out.println("You have withdrawn "+debitAmount+" amount.\nCurent Balance "+balance);
		return balance;
		}
	}

	public static void main(String[] args) {
		debit(5000);//balance will be left 5000
		debit(6000);//it wont allow to deduct any money because balance < debit amount.
		
	}

}
