package com.bank.exception;

public class AccountNotExistException extends Exception {

	@Override
	public String toString() {
		return "Account No Found !!";
	}

}
