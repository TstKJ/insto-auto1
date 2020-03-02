package com.restWS.demo.model;

public class AccountListEnquiry {

	Integer AcctNumber;
	String AcctName;
	String AcctType;
	String Currency;
	Double OpeningBal;

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
	public String getAcctType() {
		return AcctType;
	}
	public void setAcctType(String acctType) {
		AcctType = acctType;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public Double getOpeningBal() {
		return OpeningBal;
	}
	public void setOpeningBal(Double openingBal) {
		OpeningBal = openingBal;
	}

	
}