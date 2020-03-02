package com.restWS.demo.model;

public class AccountTransactionEnquiry {

	Integer AcctNumber;
	String AcctName;
	String Currency;
	Double CreditAmt;
	String DebitOrCredit;

	public Integer getAcctNumber() {
		return AcctNumber;
	}

	public void setAcctNumber(Integer acctNumber) {
		AcctNumber = acctNumber;
	}

	public String getAcctName() {
		return AcctName;
	}

	public void setAcctName(String acctName) {
		AcctName = acctName;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public Double getCreditAmt() {
		return CreditAmt;
	}

	public void setCreditAmt(Double creditAmt) {
		CreditAmt = creditAmt;
	}

	public String getDebitOrCredit() {
		return DebitOrCredit;
	}

	public void setDebitOrCredit(String debitOrCredit) {
		DebitOrCredit = debitOrCredit;
	}

}
