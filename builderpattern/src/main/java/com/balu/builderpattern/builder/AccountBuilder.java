package com.balu.builderpattern.builder;

import java.lang.reflect.Constructor;

import com.balu.builderpattern.account.SBIAccount;

public  class AccountBuilder {
	private long accountNo;
	private String accountHolder;
	private String branch;
	private double balance;
	private double intrestRate;
	
	public AccountBuilder(long accountNo) {
		this.accountNo=accountNo;
	}
	public AccountBuilder withAccountHolder(String accopuntHolder) {
		this.accountHolder=accopuntHolder;
		return this;
	}
	public AccountBuilder atBranch(String branch) {
		this.branch=branch;
		return this;
	}
	public AccountBuilder openingBalance(double balance) {
		this.balance=balance;
		return this;
	}
	public AccountBuilder atRate(double intrestRate) {
		this.intrestRate=intrestRate;
		return this;
	}
	public SBIAccount build()  {
		SBIAccount account=null;
		
		try {
			Class clazz=Class.forName("com.balu.builderpattern.account.SBIAccount");
			Constructor<?> constructor=clazz.getDeclaredConstructor();
			constructor.setAccessible(true);
			account=(SBIAccount)constructor.newInstance();
			account.setAccountNo(accountNo);
			account.setAccountHolder(accountHolder);
			account.setBranch(branch);
			account.setBalance(balance);
			account.setIntrestRate(intrestRate);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return account;
	}
}
