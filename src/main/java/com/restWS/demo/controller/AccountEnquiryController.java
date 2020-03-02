package com.restWS.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restWS.demo.model.AccountListEnquiry;
import com.restWS.demo.model.AccountTransactionEnquiry;

@RestController
@RequestMapping(path = "/accountEnquiry")
public class AccountEnquiryController {

	@GetMapping(path = "/list")
	public List<AccountListEnquiry> getAcctListEnquiryData() {

		List<AccountListEnquiry> acctList = new ArrayList<AccountListEnquiry>();

		for (int i = 0; i < 10; i++) {

			AccountListEnquiry accountListEnquiry = new AccountListEnquiry();
			accountListEnquiry.setAcctName("TestAcct" + i);
			accountListEnquiry.setAcctNumber(123 + i);
			accountListEnquiry.setAcctType("Savings");
			accountListEnquiry.setCurrency("SGD");
			accountListEnquiry.setOpeningBal(1.0 + i);
			acctList.add(accountListEnquiry);

		}

		return acctList;

	}

	@GetMapping(path = "/transaction/{acctNum}")
	public List<AccountTransactionEnquiry> getAcctTransactionEnquiryData(@PathVariable("acctNum") Integer acctNum) {

		List<AccountTransactionEnquiry> acctTransaction= new ArrayList<AccountTransactionEnquiry>();

		for (int i = 0; i < 10; i++) {

			AccountTransactionEnquiry accountTransactionEnquiry = new AccountTransactionEnquiry();
			accountTransactionEnquiry.setAcctNumber(acctNum);
			accountTransactionEnquiry.setAcctName("CurrentAccount");
		    accountTransactionEnquiry.setCurrency("SGD");
			accountTransactionEnquiry.setCreditAmt(1.0 + i);
			accountTransactionEnquiry.setDebitOrCredit("Debit");
			
			acctTransaction.add(accountTransactionEnquiry);

		}

		return acctTransaction;

	}

}
