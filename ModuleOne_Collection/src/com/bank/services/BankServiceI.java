package com.bank.services;

public interface BankServiceI {

	boolean setBankDetails(String account_no, String customer_name, int balance, String city, String phone_no, int pin);

}
