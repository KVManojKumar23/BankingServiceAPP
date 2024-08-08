package com.BankService;

import java.util.Scanner;


import com.BankEntity.BankUserProfile;

public class BankServiceIMP implements BankServiceInterface {
	
	BankUserProfile bankUserProfile = new BankUserProfile();
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void CreateBankAccount() {
		// TODO Auto-generated method stub
		
		
		System.out.println("\nWelcom Bank of INDIA\n");
		
		System.out.println("Details of Account Holder\n");
		
		System.out.print("Name             =\t");
		bankUserProfile.setName(scanner.next());
		
		System.out.print("Account Number =\t");
		bankUserProfile.setAccountNumber(scanner.nextInt());
		
		System.out.println("\nDeposite Should be more then 1000RS");
		boolean check = true;
		do {
			System.out.print("Deposit   =\t");
			double DepositMoney = scanner.nextDouble();
			if(DepositMoney >= 1000)
			{
				bankUserProfile.setDepositMoney(DepositMoney);
				bankUserProfile.setBalance(DepositMoney);
				check = false;
			}
			else
			{
				System.out.println(DepositMoney+" is less then 1000");
			}
			
		}while(check == true);
		
		System.out.print("\nOccupation =\t");
		bankUserProfile.setOccupation(scanner.next());
		
		System.out.print("\nAGE        =\t");
		bankUserProfile.setAge(scanner.nextInt());
		
		System.out.print("\nCITY     =\t");
		bankUserProfile.setCity(scanner.next());
		
	}
	
	@Override
	public void Deposit() {
		// TODO Auto-generated method stub
		
		System.out.println("\nWelcome To Bank Of INDIA\n");
		System.out.print("Deposit =\t");
		double DepositMoney = scanner.nextDouble();
		double balance = bankUserProfile.getBalance();
		DepositMoney += balance;
		bankUserProfile.setDepositMoney(DepositMoney);
		bankUserProfile.setBalance(DepositMoney);
		System.out.println("Your Total Balance =\t"+bankUserProfile.getBalance());
		
	}
	
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("\nWelcome To Bank Of INDIA\n");
		System.out.print("Withdraw\t=\t");
		double WithdrawMoney = scanner.nextDouble();
		double balance = bankUserProfile.getBalance();
		balance -= WithdrawMoney;
		if(balance < 0)
		{
			System.out.println("Your Balance is LOW");
			System.out.println("Insufficient Balance");
		}
		else
		{
			bankUserProfile.setBalance(balance);
			System.out.println("Balance =\t"+balance);
		}
	}
	
	@Override
	public void DisplayBankDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("\nWelcome To Bank Of INDIA\n");
		System.out.println("Name          =\t"+bankUserProfile.getName());
		System.out.println("AccountNumber =\t"+bankUserProfile.getAccountNumber());
		System.out.println("Balance       =\t"+bankUserProfile.getBalance());
		System.out.println("Occupation    =\t"+bankUserProfile.getOccupation());
		System.out.println("Age           =\t"+bankUserProfile.getAge());
	}

}
