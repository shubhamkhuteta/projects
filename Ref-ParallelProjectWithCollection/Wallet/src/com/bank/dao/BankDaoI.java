package com.bank.dao;
import java.util.LinkedList;

import com.bank.bean.BankBean;

public interface BankDaoI {
	public boolean save(BankBean customer);
	public BankBean findOne(String mobileNo);

}
