package com.bank.services;

import java.util.Random;

import com.bank.bean.BankBean;
import com.bank.dao.BankDao;

public class BankService {
	BankDao bankDao = new BankDao();
	boolean res;
	double balance;
	long uniqueID;
	Random rand = new Random();
	
	public boolean setBankDetails(int account_no, String customer_name, double balance, String city, String phone_no, int pin) {
		
		BankBean bankBean = new BankBean();
		bankBean.setAccount_no(account_no);
		bankBean.setCustomer_name(customer_name);
		bankBean.setBalance(balance);
		bankBean.setPin(pin);
		bankBean.setCity(city);
		bankBean.setPhone_no(phone_no);
		uniqueID = rand.nextInt(100000); 
		String trans="----------Account created----------\n\nAccount Credited by(Opening Balance) : "+balance+" \n";
		bankBean.setTrans(trans);
		boolean res = bankDao.setData(account_no,bankBean);
		return res;
	}
	
	public double getBalance(int account_no) {
		balance = bankDao.getBalance(account_no);
		return balance;
		
	}
	
	public boolean validateAccountNo(int account_no) {
		return res = bankDao.validateAccountNo(account_no);
	}
	
	public double DepositAmount(int account_no, double balance) {
		balance = bankDao.DepositAmount(account_no,balance);
		return balance;
		
	}

	public double WithdrawAmount(int account_no, double balance2) {
		return balance = bankDao.WithdrawAmount(account_no,balance2);
		 
	}

	public double fundTransfer(int account_no, int account_no_2, double amount) {
		
		return balance = bankDao.fundTransfer(account_no, account_no_2,amount);
		
	}
	public String getTransaction(int account_no) {
		String st=bankDao.getTransaction(account_no);
		return st;
	}

	public boolean checkBalance(int account_no, double amount) {
		
		return res = bankDao.checkBalance(account_no,amount);
	}
}
