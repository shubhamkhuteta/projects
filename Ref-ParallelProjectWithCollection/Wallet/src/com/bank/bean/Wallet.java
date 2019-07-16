package com.bank.bean;

import java.math.BigDecimal;

public class Wallet {
@Override
	public String toString() {
		return "Updated Balance : "+balance;
	}
private BigDecimal balance;
public BigDecimal getBalance() {
	return balance;
}
public void setBalance(BigDecimal balance) {
	this.balance=balance;
}
}
