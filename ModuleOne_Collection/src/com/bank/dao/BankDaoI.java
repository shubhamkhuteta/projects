package com.bank.dao;

public interface BankDaoI {
	
	

	boolean setBankDetails(String account_no, String customer_name, int balance, String city, String phoneno, int pin);
}
