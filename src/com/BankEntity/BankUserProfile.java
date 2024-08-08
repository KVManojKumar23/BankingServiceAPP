package com.BankEntity;

public class BankUserProfile {
	
	private int AccountNumber;
	private String Name;
	private double depositMoney;
	private double withdrawMoney;
	private double balance;
	private int choice;
	private String City;
	private String Occupation;
	private int age;
	
	
	
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getDepositMoney() {
		return depositMoney;
	}
	public void setDepositMoney(double depositMoney) {
		this.depositMoney = depositMoney;
	}
	public double getWithdrawMoney() {
		return withdrawMoney;
	}
	public void setWithdrawMoney(double withdrawMoney) {
		this.withdrawMoney = withdrawMoney;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	
	
	
	

}
