package com.restWS.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.restWS.demo.model.AccountListEnquiry;
import com.restWS.demo.model.AccountTransactionEnquiry;

public class AccountEnquiryTest {
	List<AccountListEnquiry> acctList = new ArrayList<AccountListEnquiry>();
	List<AccountTransactionEnquiry> acctTransaction = new ArrayList<AccountTransactionEnquiry>();

	@Before
	public void loadAccountEnquiryData() {

		for (int i = 0; i < 10; i++) {

			AccountListEnquiry accountListEnquiry = new AccountListEnquiry();
			accountListEnquiry.setAcctName("TestAcct" + i);
			accountListEnquiry.setAcctNumber(123 + i);
			accountListEnquiry.setAcctType("Savings");
			accountListEnquiry.setCurrency("SGD");
			accountListEnquiry.setOpeningBal(1.0 + i);
			acctList.add(accountListEnquiry);

		}

		for (int i = 0; i < 10; i++) {
			AccountTransactionEnquiry accountTransactionEnquiry = new AccountTransactionEnquiry();
			accountTransactionEnquiry.setAcctNumber(123);
			accountTransactionEnquiry.setAcctName("CurrentAccount");
			accountTransactionEnquiry.setCurrency("SGD");
			accountTransactionEnquiry.setCreditAmt(1.0 + i);
			accountTransactionEnquiry.setDebitOrCredit("Debit");

			acctTransaction.add(accountTransactionEnquiry);

		}

	}

	@Test
	public void getAcctListEnquiryData() {

		System.out.println("AccountListEnquiry list size()>>>" + acctList.size());

		for (AccountListEnquiry acctLst : acctList) {

			System.out.println("AcctNumber:" + acctLst.getAcctNumber() + " AcctName:" + acctLst.getAcctName()
					+ " Currency:" + acctLst.getCurrency() + " OpeningBal:" + acctLst.getOpeningBal() + " AcctType:"
					+ acctLst.getAcctType());

		}

	}

	@Test
	public void getAcctTransactionEnquiryData() {
		System.out.println("AccountTransactionEnquiry list size()>>>" + acctTransaction.size());
		for (AccountTransactionEnquiry acctTran : acctTransaction) {

			System.out.println("AcctNumber:" + acctTran.getAcctNumber() + " AcctName:" + acctTran.getAcctName()
					+ " Currency:" + acctTran.getCurrency() + " CreditAmt:" + acctTran.getCreditAmt()
					+ " DebitOrCredit:" + acctTran.getDebitOrCredit());

		}

	}
}
