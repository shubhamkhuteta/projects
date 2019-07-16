package com.bank.dao;

import java.util.HashMap;
import java.util.Random;


import com.bank.bean.BankBean;

public class BankDao implements BankDaoI{

	BankBean bankBean, bankBean2;
	double bal,bal2;
	double updated_balance_deposit;
	double updated_balance_withdraw;
	String trans ;
	long uniqueID,uniqueID2;
	Random rand = new Random();
	
	HashMap<Integer, BankBean> hm ;
	
	public BankDao() {
		super();
		hm = new HashMap<Integer, BankBean>();
	}

	@Override
	public boolean setBankDetails(String account_no, String customer_name, int balance, String city, String phoneno, int pin) {
		// TODO Auto-generated method stub
		return false;

		
	}


	public boolean setData(int account_no, BankBean bankBean) {
		hm.put(account_no, bankBean);
		return true;

	}


	public double getBalance(int account_no) {
		
		if(hm.containsKey(account_no)) {

			bankBean=(BankBean) hm.get(account_no);
			bal= bankBean.getBalance();
		}
		return bal;
	}


	public boolean validateAccountNo(int account_no) {
		if(hm.containsKey(account_no)) {
			return false;
		}else {
			return true;
		}

	}


	public double DepositAmount(int account_no, double balance) {
		
		bankBean=(BankBean)hm.get(account_no);
		bal = bankBean.getBalance();
		
		updated_balance_deposit = balance+bal;
		bankBean.setBalance(updated_balance_deposit);
		
		hm.put(account_no, bankBean);
		
		
		uniqueID = rand.nextInt(100000); 
		//= UUID.randomUUID().toString();
		trans=bankBean.getTrans()+"Transaction ID : "+uniqueID+" Account Credited by : "+balance+" \n";
		
		bankBean.setTrans(trans);
		
		return updated_balance_deposit;
		
	}


	public double WithdrawAmount(int account_no, double balance) {
		
		bankBean=(BankBean)hm.get(account_no);
		bal = bankBean.getBalance();
		
		updated_balance_withdraw= bal-balance;
		bankBean.setBalance(updated_balance_withdraw);
		
		uniqueID = rand.nextInt(100000); 
		trans=bankBean.getTrans()+"Transaction ID : "+uniqueID+"Account Debited by : "+balance+" \n";
		bankBean.setTrans(trans);
		
		hm.put(account_no, bankBean);
		
		return updated_balance_withdraw;
	}


	public double fundTransfer(int account_no, int account_no_2, double amount) {
		
		bankBean=(BankBean)hm.get(account_no);
		bal = bankBean.getBalance();
		
		double update1 = bal-amount;
		bankBean.setBalance(update1);
		
		bankBean2=(BankBean)hm.get(account_no_2);
		bal2 = bankBean2.getBalance();
		
		double update2 = bal2+amount;
		bankBean2.setBalance(update2);
		
		uniqueID = rand.nextInt(100000); 
		uniqueID2 = rand.nextInt(100000); 
		
		String trans1=bankBean.getTrans()+"Transaction ID : "+uniqueID+"Account Debited by : "+amount+" \n";
		String trans2=bankBean2.getTrans()+"Transaction ID : "+uniqueID2+"Account Credited by : "+amount+" \n";
		
		bankBean.setTrans(trans1);
		bankBean2.setTrans(trans2);

		return update2;
		
	}

	public String getTransaction(int account_no) {
		bankBean=(BankBean)hm.get(account_no);
		String st = bankBean.getTrans();
		
		return st;
	}


	public boolean checkBalance(int account_no, double amount) {
		bankBean=(BankBean)hm.get(account_no);
		bal = bankBean.getBalance();
		if(bal<amount) 
		{
			return false;
		}
		else 
		{
			return true;
		}
		
	}



}
