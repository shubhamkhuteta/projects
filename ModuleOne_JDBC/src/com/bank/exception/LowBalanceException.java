package com.bank.exception;

public class LowBalanceException extends Exception {

	@Override
	public String toString() {
		return "Insufficient Balance in your account";
	}

}
