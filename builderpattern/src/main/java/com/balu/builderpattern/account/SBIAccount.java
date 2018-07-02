package com.balu.builderpattern.account;

public class SBIAccount {
	private long accountNo;
	private String accountHolder;
	private String branch;
	private double balance;
	private double intrestRate;
	private String location;
	private String city:
	
	private SBIAccount(){
		/* 
		 * Empty implention to make other classes not allowed 
		 * to create object of this class directly
		 */
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getIntrestRate() {
		return intrestRate;
	}
	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}
	@Override
	public String toString() {
		return "SBIAccount [accountNo=" + accountNo + ", accountHolder=" + accountHolder + ", branch=" + branch
				+ ", balance=" + balance + ", intrestRate=" + intrestRate + "]";
	}
	
	
}
