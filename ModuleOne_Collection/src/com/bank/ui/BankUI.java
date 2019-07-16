package com.bank.ui;
import java.util.*;
import com.bank.exception.*;
import com.bank.services.BankService;


public class BankUI 
{

	static BankUI bankUi = new BankUI();
	Scanner scanner = new Scanner(System.in);

	BankService bankService= new BankService();

	String customer_name,phone_no,city;
	double balance;
	int pin,account_no, account_no_2; 
	boolean res,res2;
	String city_pattern = "	[a-zA-Z]+ [_] [a-zA-Z]+";
	Random rand = new Random();

	public static void main(String[] args) throws LowBalanceException, AccountNotExistException, AccountNoAlreadyExistException {

		bankUi.chooseAny();
	}

	public void showMenu() 
	{
		System.out.println("1. Create Account ");
		System.out.println("2. Show Balance ");
		System.out.println("3. Deposit");
		System.out.println("4. Withdraw");
		System.out.println("5. Fund Transfer");
		System.out.println("6. Account Statement");
		System.out.println("7. Log out");
		System.out.println("Enter your choice :");
	}

	public void chooseAny() throws LowBalanceException, AccountNotExistException,AccountNoAlreadyExistException
	{
		System.out.println("----------Welcome to UI Bank----------");
		int close=0;
		while (close==0) {

			showMenu();
			int input=scanner.nextInt();

			switch (input)//input=1, flow-8
			{
			case 1: {

				res=false;
				while(res==false) {
					System.out.println("Enter Your Full Name <First Name> <Last Name>: ");
					customer_name=scanner.next();
					customer_name+=scanner.nextLine();
				
					
					if(customer_name.matches("^[a-zA-Z]*$")) {
						res=true;
					}else {
						System.out.println("Enter a valid name");
					}
				
				}
					
				res=false;
				while(res==false ) {
					System.out.println("Enter Your Phone No : ");
					phone_no=scanner.next();
					
					if(phone_no.matches("[6-9][0-9]{9}")) {
						res=true;
					}else {
						System.out.println("Please enter a valid phone no!");
					}
				}
				
				res=false;
				while(res==false ) {
					System.out.println("Enter Balance : ");
					balance=scanner.nextDouble();
					
					if(balance<10000) {
						res=true;
					}else {
						System.out.println("Minimum balance 10000!");
					}
				}

				res=false;
				while(res==false) {
					System.out.println("Enter your City : ");
					city=scanner.next();

					if(city.matches("^[a-zA-Z]*$"))
					{
						res=true;
						System.out.println("Set your 4 digit pin : ");
						pin=scanner.nextInt();
						res= bankService.validateAccountNo(account_no);

						if(res==true) 
						{
							
							account_no=rand.nextInt(100000); ;
							res = bankService.setBankDetails(account_no, customer_name, balance, city, phone_no, pin);
							
							if(res==true) 
							{
								System.out.println("Account successfully created !");
								System.out.println("Your Account No. is : "+account_no);
								System.out.println("Your opening balance is : "+balance);
							}else {
								System.out.println("Account Creation Failed !!");
							}

						}else if(res==true){
							throw new AccountNoAlreadyExistException();
						}
					}else {
						System.out.println("Please enter a valid name!!");
					}
					
					
					
				}
			}

				break;
			

			case 2: {

				System.out.println("Enter Account No. : ");
				account_no=scanner.nextInt();

				res=bankService.validateAccountNo(account_no);

				if(res=true) 
				{
					balance = bankService.getBalance(account_no);
					System.out.println("Current Balance : "+balance);
				}
				else 
				{
					throw new AccountNotExistException();
				}

				break;
			}

			case 3: {

				System.out.println("Enter Account No. : ");
				account_no=scanner.nextInt();

				res = bankService.validateAccountNo(account_no);

				if(res==true) 
				{
					System.out.println("Enter Amount to be deposited : ");
					balance=scanner.nextDouble();

					balance = bankService.DepositAmount(account_no, balance);
					System.out.println("Updated Balance : "+balance);
				}
				else 
				{
					System.out.println("Something Went Wrong !!");
				}

				break;
			}

			case 4 : {

				System.out.println("Enter Account No. : ");
				account_no=scanner.nextInt();

				res = bankService.validateAccountNo(account_no);

				if(res==true) 
				{

					System.out.println("Enter Amount to be withdrawn : ");
					double balance1=scanner.nextDouble();

					res = bankService.checkBalance(account_no,balance1);

					if(res==true) {
						double bal=bankService.WithdrawAmount(account_no, balance1);
						System.out.println("Updated Balance : "+bal);
					}else {
						throw new LowBalanceException();
					}


				}
				else 
				{
					System.out.println("Something Went Wrong !!");
				}

				break;
			}

			case 5 :

				System.out.println("Enter Account No. : ");
				account_no=scanner.nextInt();

				res = bankService.validateAccountNo(account_no);

				if(res==true) 
				{
					System.out.println("Enter account no. in which you want to transfer : ");
					account_no_2 = scanner.nextInt();

					res = bankService.validateAccountNo(account_no_2);

					if(res==true) 
					{
						System.out.println("Enter Amount : ");
						double amount = scanner.nextInt();

						res = bankService.checkBalance(account_no,amount);

						if(res==true) 
						{
							double fund_result = bankService.fundTransfer(account_no,account_no_2,amount);
							System.out.println("Updated Balance : "+fund_result );
						}
						else 

						{
							throw new LowBalanceException();
						}


					}

					else 
					{
						throw new AccountNotExistException();
					}
				}
				else 
				{
					throw new AccountNotExistException();
				}

				break;

			case 6 : 
				System.out.println("Enter Account No : ");
				account_no=scanner.nextInt();

				res = bankService.validateAccountNo(account_no);
				if(res==true) {

					String st=bankService.getTransaction(account_no);

					System.out.println("----------Account Statement----------\n");

					System.out.println(st);

				}
				else 
				{
					throw new AccountNotExistException();
				}
				break;

			case 7 : 

				System.out.println("You have been successfully logged out");

				System.out.println("Do you want to exit ? press 0 to continue 1 to exit");

				close=scanner.nextInt();

				if(close==0) 
				{
					close=0;
				}
				else 
				{
					System.exit(0);
				}

			default:{

				System.out.println("Please enter valid choice!");

				break;
			}
			}
		}
	}


}

