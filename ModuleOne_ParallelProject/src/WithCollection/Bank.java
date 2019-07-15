package WithCollection;

import java.util.*;



public class Bank {
	static String account_no;
	static HashMap<String, Account> hm = new HashMap<String, Account>();
	static Account account=new Account();
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {


		int close = 0;


		while(close==0){

			System.out.println("1. Create Account ");
			System.out.println("2. Show Balance ");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Fund Transfer");
			System.out.println("6. Account Statement");
			System.out.println("7. Log out");
			System.out.println("Enter your choice :");

			int input=sc.nextInt();

			switch(input) {
			case 1 : 

				System.out.println("Enter your name : ");
				String name=sc.nextLine();
				name+=sc.nextLine();
				account.setName(name);

				String phone_no=null;
				boolean phone_result=false;
				while(phone_result==false ) {
					System.out.println("Enter your phone no : ");
					phone_no=sc.nextLine();

					if(phone_no.length()==10) {
						phone_result=true;
						account.setPhoneno(phone_no);
					}else {
						System.out.println("Invalid length");
					}
				}

				System.out.println("Enter your City : ");
				String address=sc.nextLine();
				account.setAddress(address);

				System.out.println("Enter your balance : ");
				int balance=sc.nextInt();
				account.setBalance(balance);

				boolean pin_result=false;
				while(pin_result==false ) {
					System.out.println("Set your 4 digit pin : ");
					int pin=sc.nextInt();
					System.out.println("Please enter your pin again :  ");
					int pin_again=sc.nextInt();
					if(pin==pin_again || pin<4) {
						pin_result=true;
						account.setPin(pin);
					}else {
						System.out.println("Values does not match or invalid length");
					}
					account.setPin(pin);
					account_no= account.setAccount_no((phone_no)+pin);
					System.out.println(account.getAccount_no());
				}

				if(hm.containsKey(account_no)) {
					System.out.println("Account already exists !!");
				}else {
					hm.put(account_no, account);
					System.out.println("Account created successfully");
					System.out.println(hm);
				}
				break;

			case 2:
				System.out.println("Show balance");
				System.out.println();
				System.out.println("Your current balance is :"+account.getBalance());

				break;

			case 3:

				System.out.println("Enter your account no : ");
				String accountno=sc.nextLine();
				if(hm.containsKey(accountno))
				{
					System.out.println("Enter amount : ");
					int deposit=sc.nextInt();
					account.setBalance(+deposit);
					System.out.println(account.getBalance());

				}
				else {
					System.out.println("Account no. does not exist !");
				}
				break;
			case 4:
				System.out.println("Withdraw cash");
				break;
			case 5:
				System.out.println("Fund transfer");
				System.out.println("Enter your account no : ");
				String accountno2=sc.nextLine();
				if(hm.containsKey(accountno2))
				{
					System.out.println("Enter the account no in which you want to transfer the money : ");
					String another_no=sc.nextLine();
				}
				break;
			case 6:
				System.out.println("Account Statement");
				break;
			case 7:
				System.out.println("You have been successfully logged out");
				System.out.println("Do you want to exit ? press 0 to continue 1 to exit");
				close=sc.nextInt();
				if(close==0) {
					close=0;
				}else {
					System.exit(0);
				}

				break;

			default: 
				System.out.println("Please enter valid choice!");

				break;

			}	
			//sc.close();
		}
	}

}
