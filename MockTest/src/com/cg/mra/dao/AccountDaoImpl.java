package com.cg.mra.dao;

import com.cg.mra.bean.Account;

import java.util.HashMap;
import java.util.Map;


public class AccountDaoImpl implements AccountDao {

    private Map<String, Account> accountEntry;

    protected Map<String, Account> getAccountEntry() {
        return accountEntry;
    }
    
    public AccountDaoImpl() {
        accountEntry = new HashMap<>();
        accountEntry.put("9010210131", new Account("prepaid", "Vaishali", 200));
        accountEntry.put("9823920123", new Account("prepaid", "Megha", 450));
        accountEntry.put("9932012345", new Account("prepaid", "Vikas", 631));
        accountEntry.put("9010210131", new Account("prepaid", "Anju", 521));
        accountEntry.put("9010210131", new Account("prepaid", "Tushar", 632));

    }
    
    public Account getAccount(final String mobileNo) {
        return getAccountEntry().get(mobileNo);
    }
  
    
    @Override
    public Account getAccountDetails(final String mobileNo) {
        validationCheck(mobileNo);
        Account account = getAccount(mobileNo);
        return account;
    }

  
    public void validationCheck(final String mobileNo) {
        boolean noExists = getAccountEntry().containsKey(mobileNo);
        if (!noExists) {
            throw new AccountNotExistException();
        }

    }

 
    @Override
    public int rechargeMyAccount(final String mobileNo, final double rechargeAmount) {
        validationCheck(mobileNo);
        Account account = getAccount(mobileNo);
        double initialBalance = account.getAccountBalance();
        double balanceNow = initialBalance + rechargeAmount;
        return (int) balanceNow;
    }


}
