package com.balu.builderpattern;

import com.balu.builderpattern.account.SBIAccount;
import com.balu.builderpattern.builder.AccountBuilder;

public class Test {
	public static void main(String[] args) {
		SBIAccount account = new AccountBuilder(12346678).withAccountHolder("RAJASEKHAR Reddy ").atBranch("KNG")
				.openingBalance(800800.00).atRate(2.50).build();
		System.out.println(account);
	}
}
