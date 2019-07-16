package com.cg.eis.pl;

import java.util.Random;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class EmployeeUI {
	static EmployeeUI EmpUi = new EmployeeUI();
	Scanner scanner = new Scanner(System.in);
	EmployeeService empService= new EmployeeService();
	Random rand = new Random();
	
	String name,designation,insuranceScheme;
	double salary;
	String id;
	boolean res,res2;
	
	

	public static void main(String[] args)  {

		EmpUi.chooseAny();
	}

	public void showMenu() 
	{
		System.out.println("1. Create Account ");
		System.out.println("2. Find My Insurance Scheme ");
		System.out.println("3. Display My Details");
		System.out.println("4. Exit");
	
	}

	public void chooseAny() 
	{
		System.out.println("----------Welcome to ATOM Inc.----------");
		int close=0;
		while (close==0) {

			showMenu();
			int input=scanner.nextInt();

			switch (input)//input=1, flow-8
			{
			case 1: {

				res=false;
				while(res==false) {
					System.out.println("Enter Your ID : ");
					id=scanner.next();
				
					if(id.matches("[0-9]{6}")) {
						res=true;
					}else {
						System.out.println("Enter a valid id");
					}
				
				}
					
				res=false;
				while(res==false ) {
					System.out.println("Enter Your name : ");
					name=scanner.next();
					
					if(name.matches("^[a-zA-Z]*$")) {
						res=true;
					}else {
						System.out.println("Please enter a valid name!");
					}
				}
				
				res=false;
				while(res==false ) {
					System.out.println("Enter salary : ");
					salary=scanner.nextDouble();
					
					if(salary<10000) {
						res=true;
					}else {
						System.out.println("Minimum balance 10000!");
					}
				}

				
				res=false;
				while(res==false) {
					System.out.println("Enter your designation : ");
					designation=scanner.next();

					if(designation.matches("^[a-zA-Z]*$"))
					{
						
						res = empService.setEmpDetails(id, name, salary, designation, insuranceScheme);
							
						if(res==true) 
						{
							System.out.println("Account successfully created !");
							System.out.println("Your ID is : "+id);
			
						}else {
							System.out.println("Account Creation Failed !!");
						}
					}else {
						System.out.println("Please enter a valid name!!");
					}
				}
			}

				break;
			

			case 2: {
				
			}

			case 3: {

				System.out.println("Enter Your ID : ");
				id=scanner.next();
				Employee emp = empService.getInfo(id);
				System.out.println("Info : "+emp);
				break;
			}

			case 4 : {

				/*System.out.println("Enter Account No. : ");
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

				break;*/
			}

			case 5 :

				/*System.out.println("Enter Account No. : ");
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
				}*/

				break;

			case 6 : 
				/*System.out.println("Enter Account No : ");
				account_no=scanner.nextInt();

				res = res = bankService.validateAccountNo(account_no);
				if(res==true) {

					String st=bankService.getTransaction(account_no);

					System.out.println("----------Account Statement----------\n");

					System.out.println(st);

				}
				else 
				{
					throw new AccountNotExistException();
				}*/
				break;

			case 7 : 

				/*System.out.println("You have been successfully logged out");

				System.out.println("Do you want to exit ? press 0 to continue 1 to exit");

				close=scanner.nextInt();

				if(close==0) 
				{
					close=0;
				}
				else 
				{
					System.exit(0);
				}*/

			default:{

				System.out.println("Please enter valid choice!");

				break;
			}
			}
		}
	}

}
