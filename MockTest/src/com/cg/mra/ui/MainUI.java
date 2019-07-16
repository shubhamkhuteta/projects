package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.dao.AccountNotExistException;
import com.cg.mra.dao.IncorrectMobileNoException;
import com.cg.mra.bean.Account;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {

	private AccountService accountService = new AccountServiceImpl(new AccountDaoImpl());

	public void showMenu() 
	{
		System.out.println("\n1. Account Balance Enquiry");
		System.out.println("2. Recharge Account");
		System.out.println("3. Exit");
	}

	public int getOption(Scanner scanner)

	{
		try {
			int option = scanner.nextInt();
			return option;
		} catch (Throwable e) {
			System.out.println("Incorrect Input, Please Enter Your Choice Again!!");
			chooseOperation();
			return -1;
		}
	}

	public void chooseOperation()
	{
		boolean input = true;
		while (input) {
			showMenu();
			Scanner scanner = new Scanner(System.in);
			int choose = getOption(scanner);
			
			if (choose == -1)
			{
				input = false;
			}
			switch (choose)
			{
			case 1: {
				try {
					System.out.println("Enter Your Mobile No : ");
					String mobNumber = scanner.next();

					AccountService service = getAccountService();
					Account account = service.getAccountDetails(mobNumber);

					System.out.println(account);


				} 

				catch (AccountNotExistException e) {
					System.out.println("Mobile No does not exist");
				} 

				catch (IncorrectMobileNoException e) {
					System.out.println("Mobile number is not a correct mobile number");
				} 

				catch (Throwable e) {
					System.out.println("Something Went Wrong!!");
				}
				break;
			}
			case 2: {
				try {
					System.out.println("Enter mobile no");
					String mobileNo = scanner.next();

					System.out.println("Enter recharge amount");
					double rechargeAmount = scanner.nextDouble();

					AccountService service = getAccountService();

					int updatedBalance = service.rechargeMyAccount(mobileNo, rechargeAmount);
					System.out.println("Acccount Recharged successfully");

					System.out.println("Updated Balance : "+updatedBalance);
				} 


				catch (AccountNotExistException e) {
					System.out.println("Mobile No is not Exist!!");
				} 

				catch (IncorrectMobileNoException e) {
					System.out.println("Mobile No Format is Incorrect!!");
				} 

				catch (Throwable e) {
					e.printStackTrace();
					System.out.println("Something went wrong!!");
				}
				break;}
			
			case 3 : 
				System.out.println("Good Bye, See Your Soon!!");
				System.exit(0);
			default: {
				input = false;
				System.out.println("Invalid Input, Please enter your choice again!!");
				chooseOperation();
			}

			}

		}

	}

	public static void main(String[] args) {
		System.out.println("*****Welcome to Unsigned Integer Application******");
		MainUI ui = new MainUI();
		ui.chooseOperation();
	}

	public AccountService getAccountService() {
		return accountService;
	}

}