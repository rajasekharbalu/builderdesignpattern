package com.balu.builderpattern;

import com.balu.builderpattern.account.SBIAccount;
import com.balu.builderpattern.builder.AccountBuilder;

public class Test {
	public static void main(String[] args) {
		SBIAccount account = new AccountBuilder(12346678).withAccountHolder("Srinu").atBranch("Chennai")
				.openingBalance(80000.00).atRate(2.50).build();
		System.out.println(account);
	}
}
