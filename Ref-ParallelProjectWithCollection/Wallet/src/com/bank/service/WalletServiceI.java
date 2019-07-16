package com.bank.service;

import java.math.BigDecimal;
import java.util.List;
import com.bank.bean.BankBean;
import com.bank.exception.DuplicateMobileNumberException;
import com.bank.exception.InsufficientAmountException;
import com.bank.exception.MobileNoDoesNotExistException;

public interface WalletServiceI {

	public BankBean createAccount(String name,String mobileNo,BigDecimal amount) throws DuplicateMobileNumberException;
	public BankBean showBalance(String mobileNo) throws MobileNoDoesNotExistException;
	public List<BankBean> fundTransfer(String sourceMobileNo,String targetMobileNo,BigDecimal amount) throws MobileNoDoesNotExistException,InsufficientAmountException;
	public BankBean depositAmount(String mobileNo,BigDecimal amount)throws MobileNoDoesNotExistException;
	public BankBean withdrawAmount(String mobileNo,BigDecimal amount)throws MobileNoDoesNotExistException,InsufficientAmountException;
	
	
	
}
