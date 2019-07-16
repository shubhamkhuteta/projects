package com.cg.mra.dao;

public class IncorrectMobileNoException extends RuntimeException{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "You entered incorrect mobile number!!";
	}


}
