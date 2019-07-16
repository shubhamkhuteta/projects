package com.cg.mra.service;

import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.IncorrectMobileNoException;
import com.cg.mra.bean.Account;

public class AccountServiceImpl implements AccountService {
	
    private AccountDao accountDao;
    
    public AccountDao getAccountDao(){
        return accountDao;
    }
    public void setAccountDao(final AccountDao accountDao){
        this.accountDao=accountDao;
    }
    public AccountServiceImpl(){
    }
    public AccountServiceImpl(final AccountDao accountDao){
        this.accountDao=accountDao;
    }
    public void validateNumber(String mobileNo){
        if(mobileNo==null || mobileNo.length()!=10){
            throw new IncorrectMobileNoException();
        }
    }
    @Override
    public Account getAccountDetails(final String mobileNo) {
        validateNumber(mobileNo);
        Account account= getAccountDao().getAccountDetails(mobileNo);
        return account;
    }
    @Override
    public int rechargeMyAccount(final String mobileNo,final double rechargeAmount) {
        validateNumber(mobileNo);
        int balanceNow=getAccountDao().rechargeMyAccount(mobileNo, rechargeAmount);
        return balanceNow;
    }
}
