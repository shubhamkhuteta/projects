package com.cg.mra.service;

import com.cg.mra.bean.Account;

public interface AccountService {

    Account getAccountDetails(String mobileNo);

    int rechargeMyAccount(String mobileNo,double rechargeAmount);
}
