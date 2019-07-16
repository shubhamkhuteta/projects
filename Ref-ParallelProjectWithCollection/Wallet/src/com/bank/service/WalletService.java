package com.bank.service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.bank.bean.BankBean;

import com.bank.bean.Wallet;
import com.bank.dao.BankDaoI;
import com.bank.exception.DuplicateMobileNumberException;
import com.bank.exception.InsufficientAmountException;
import com.bank.exception.MobileNoDoesNotExistException;

public class WalletService implements WalletServiceI {
	
	BankDaoI walletRepo;
	
	public WalletService(BankDaoI walletRepo) {
		super();
		this.walletRepo = walletRepo;
	}
	BankBean customer;

	Wallet w;
	int counter=1;
	@Override
	public BankBean createAccount(String name, String mobileNo, BigDecimal amount) throws DuplicateMobileNumberException {
		
		customer=new BankBean();
		customer.setName(name);
		customer.setMobileNo(mobileNo);
		if(walletRepo.findOne(mobileNo)!=null) {
			throw new DuplicateMobileNumberException();
		}
		w=new Wallet();
		w.setBalance(amount);
		customer.setWallet(w);
	
		walletRepo.save(customer);
		return customer;
	}

	@Override
	public BankBean showBalance(String mobileNo) throws MobileNoDoesNotExistException {
		if(walletRepo.findOne(mobileNo)==null)
			throw new MobileNoDoesNotExistException();
		return walletRepo.findOne(mobileNo);
	}

	@Override
	public List<BankBean> fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) throws MobileNoDoesNotExistException, InsufficientAmountException {
		
		BankBean customer1=new BankBean();
		List<BankBean> list=new LinkedList<>();
		customer1=walletRepo.findOne(sourceMobileNo);
		if(customer1!=null) {
			BankBean customer2=new BankBean();
			customer2=walletRepo.findOne(targetMobileNo);
			if(customer2!=null) {
				list.add(withdrawAmount(sourceMobileNo, amount));
				list.add(depositAmount(targetMobileNo, amount));
			}
			
		}
		
		return list;
	}

	@Override
	public BankBean depositAmount(String mobileNo, BigDecimal amount) throws MobileNoDoesNotExistException {
		customer=showBalance(mobileNo);
		w=customer.getWallet();
		w.setBalance(w.getBalance().add(amount));
		customer.setWallet(w);
		
		walletRepo.save(customer);
		return customer;
	}

	@Override
	public BankBean withdrawAmount(String mobileNo, BigDecimal amount) throws MobileNoDoesNotExistException, InsufficientAmountException {
		
		customer=showBalance(mobileNo);
		w=customer.getWallet();
		if(w.getBalance().compareTo(amount)==-1)
			throw new InsufficientAmountException();
		w.setBalance(w.getBalance().subtract(amount));
		customer.setWallet(w);
		
		walletRepo.save(customer);
		return customer;
	}




}
