package com.BankMenu;

import java.util.Scanner;

import com.BankEntity.BankUserProfile;
import com.BankService.BankServiceIMP;

public class BankMenuApp extends BankServiceIMP {
	
	BankUserProfile bankUserProfile = new BankUserProfile();
	Scanner scanner = new Scanner(System.in);
	
	public void Menu()
	{
		int choice;
		
		System.out.println("\nWelcome Bank of INDIA\n");
		System.out.println("\t1: Create Account\n\t2: Deposit\n\t3: Withdraw\n\t4: Display Bank Details\n\t5: EXIT");
		
		System.out.print("\nChoose one =\t");
		bankUserProfile.setChoice(scanner.nextInt());
		
		choice = bankUserProfile.getChoice();
		
		switch (choice) {
		case 1: {
			CreateBankAccount();
			Menu();
		}
		case 2: {
			Deposit();
			Menu();
		}
		case 3:{
			withdraw();
			Menu();
		}
		case 4:{
			DisplayBankDetails();
			Menu();
		}
		case 5:{
			System.exit(0);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
	
}
