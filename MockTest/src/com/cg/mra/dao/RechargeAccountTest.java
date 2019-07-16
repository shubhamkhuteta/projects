package com.cg.mra.dao;

import org.junit.Assert;
import org.junit.Test;

import com.cg.mra.bean.Account;



public class RechargeAccountTest {
	AccountDaoImpl dao = new AccountDaoImpl();
	
	@Test
	public void testRechargeAccount() {
		String mobNumber = "9823920123";
		Account beforeRecharge = dao.getAccount(mobNumber);
		System.out.println("Before Recharge : "+beforeRecharge.getAccountBalance());
		
		int afterRecharge = dao.rechargeMyAccount(mobNumber, 100);
		
		int expectedAmount = 550;
		
		Assert.assertEquals(afterRecharge,expectedAmount);
		
		System.out.println("After Recharge : "+afterRecharge);
		
	}
}
