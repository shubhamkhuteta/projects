package com.bank.dao;

import java.util.HashMap;

import com.bank.bean.BankBean;

public class BankDao implements BankDaoI{

	BankBean bankBean;
	HashMap<String,BankBean> hm=new HashMap<>();
	@Override
	public boolean save(BankBean bankBean) {
		if(hm.put(bankBean.getMobileNo(),bankBean) != null)
			return true;
		return false;
	}
	int flag=0;
	
	@Override
	public BankBean findOne(String mobileNo) {
		if(hm.containsKey(mobileNo)){
			return hm.get(mobileNo);
		}
		return null;
	}
	
}
			

