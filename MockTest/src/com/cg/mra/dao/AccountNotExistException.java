package com.cg.mra.dao;

public class AccountNotExistException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Account Not Exist!!";
	}

}
