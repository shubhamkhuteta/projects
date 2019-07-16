package WithJDBC;

import java.net.StandardSocketOptions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import WithCollection.Account;

public class BankModule {
	
	static String Q_insert = "insert into bank(accoount_no, name, phone_no, balance, pin) values(?, ?, ?, ?, ?)";
	static String Q_deposit="update bank set deposit_amount=? where accoount_no=?";
	static String Q_withdraw="update bank set withdraw_amount=? where accoount_no=?";
	static AccountInfo account=new AccountInfo();
	static Scanner sc=new Scanner(System.in);
	static int deposit_statement;
	static int withdraw_statement;
	static String fromAccount;
	static String toAccount;
	static int transferAmount;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int close = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		

		// First Step //
		//loading the driver class --> Oracle Class available in --> oracle.jdbc.driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// Second Step //
		// Create the connection --> Driver Manager

		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abc", "abc123");

		// Third Step //
		//Creating Statement
		Statement st=conn.createStatement();

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
				
				System.out.println("Enter your account no. : ");
				String account_no=sc.next();
				
				System.out.println("Enter your name : ");
				String name=sc.next();
				
				String phone_no=null;
				boolean phone_result=false;
				while(phone_result==false ) {
					System.out.println("Enter your phone no : ");
					phone_no=sc.next();

					if(phone_no.length()==10) {
						phone_result=true;
						
					}else {
						System.out.println("Invalid length");
					}
				}

				System.out.println("Enter your balance : ");
				int balance=sc.nextInt();

				
				int pin=0;
				boolean pin_result=false;
				while(pin_result==false ) {
					System.out.println("Set your 4 digit pin : ");
					pin=sc.nextInt();
					System.out.println("Please enter your pin again :  ");
					int pin_again=sc.nextInt();
					System.out.println(pin_again);
					if(pin==pin_again || pin==4 || pin_again==4) {
						System.out.println("Pin Matched!");
						pin_result=true;
						
					}else {
						System.out.println("Values does not match or invalid length");
					}
					
					//account_no= account.setAccount_no((phone_no)+pin);
					//System.out.println(account.getAccount_no());
				}

				
				pstmt = conn.prepareStatement(Q_insert); // create a statement
				pstmt.setString(1,account_no ); // set input parameter 1
				pstmt.setString(2, name); // set input parameter 2
				pstmt.setString(3, phone_no); // set input parameter 3
				pstmt.setInt(4, balance);
				pstmt.setInt(5, pin);
				
				int i=pstmt.executeUpdate(); // execute insert statement
				if(i==1) {
					
					System.out.println("**********Account created successfully!**********");
				}else {
					System.out.println("Account creation failed!");
				}
				
				
				break;

			case 2:
				int showbalance = 0;
				String Q_select = "select balance from bank where accoount_no = ?";
			    pstmt = conn.prepareStatement(Q_select); // create a statement
			    System.out.println("Enter your account no : ");
			    String show_balance=sc.next();
			    
			    pstmt.setString(1, show_balance); // set input parameter
			    rs = pstmt.executeQuery();
			    System.out.println(rs);
			    // extract data from the ResultSet
			    while (rs.next()) {
			        showbalance = rs.getInt(1);
			        System.out.println("Your current balance is : "+showbalance);
			      }

			    
				break;

			case 3:
				int showbalance_2 = 0;
				String Q_select_2 = "select balance from bank where accoount_no = ?";
				pstmt = conn.prepareStatement(Q_select_2);
				System.out.println("Enter your account no : ");
				int account_balance=sc.nextInt();
				pstmt.setInt(1, account_balance); // set input parameter
			    rs = pstmt.executeQuery();
			    
			    // extract data from the ResultSet
			    while (rs.next()) {
			        showbalance_2 = rs.getInt(1);
			        System.out.println("Your current balance is : "+showbalance_2);
			      }
			    
				String Q_update = "update bank set balance = ? where accoount_no = ? ";
				pstmt = conn.prepareStatement(Q_update);
				
				System.out.println("Enter amount : ");
				int deposit_balance=sc.nextInt();
				System.out.println(deposit_balance);
				int final_balance=deposit_balance+showbalance_2;
				pstmt.setInt(1,final_balance);
				pstmt.setInt(2, account_balance);
				pstmt.executeUpdate(); 
				System.out.println("Updated Balance : "+final_balance);
				deposit_statement=final_balance;
				pstmt = conn.prepareStatement(Q_deposit);
				pstmt.setInt(1, deposit_balance);
				pstmt.setInt(2, account_balance);
				pstmt.executeUpdate(); 
				break;
			case 4:
			
				int deposite_balance = 0;
				String Q_select_3 = "select balance from bank where accoount_no = ?";
				pstmt = conn.prepareStatement(Q_select_3);
				System.out.println("Enter your account no : ");
				int account_deposit=sc.nextInt();
				pstmt.setInt(1, account_deposit); // set input parameter
			    rs = pstmt.executeQuery();
			    
			    // extract data from the ResultSet
			    while (rs.next()) {
			    	deposite_balance = rs.getInt(1);
			        System.out.println("Your current balance is : "+deposite_balance);
			      }
			    
				String Q_update_2 = "update bank set balance = ? where accoount_no = ? ";
				pstmt = conn.prepareStatement(Q_update_2);
				
				System.out.println("Enter amount : ");
				int enter_amount=sc.nextInt();
				
				int final_balance_1=deposite_balance-enter_amount;
				pstmt.setInt(1,final_balance_1);
				pstmt.setInt(2, account_deposit); 
				pstmt.executeUpdate(); 
				System.out.println("Updated Balance : "+final_balance_1);
				
				withdraw_statement=final_balance_1;
				
				pstmt = conn.prepareStatement(Q_withdraw);
				pstmt.setInt(1, enter_amount);
				pstmt.setInt(2, account_deposit);
				pstmt.executeUpdate(); 
				
				
				break;
			case 5:
				String first_account = null;
				String second_account = null;
				int transfer_amount=0;
				int first_balance=0;
				int second_balance=0;
				
				String Q_select_4 = "select balance from bank where accoount_no = ?";
				pstmt = conn.prepareStatement(Q_select_4);
				
				System.out.println("Enter your account no : ");
				first_account=sc.next();
				
				System.out.println("Enter the account no in which you want to transfer : ");
				second_account=sc.next();
				
				
				pstmt.setString(1, first_account); // set input parameter
			    rs = pstmt.executeQuery();
				
			    while (rs.next()) {
			    	first_balance = rs.getInt(1);
			        System.out.println("Your current balance is : "+first_balance);
			      }
			    
			    pstmt.setString(1, second_account); // set input parameter
			    rs = pstmt.executeQuery();
				
			  /*  while (rs.next()) {
			    	second_balance = rs.getInt(1);
			        System.out.println("Your current balance is : "+second_balance);
			      }*/
			    
			    String Q_update_fund = "update bank set balance = ? where accoount_no = ? ";
				pstmt = conn.prepareStatement(Q_update_fund);
				
			    System.out.println("Enter amount : ");
				transfer_amount=sc.nextInt();
			    System.out.println(transfer_amount);
				int final_balance_fund_1=second_balance+transfer_amount;
				
				if(transfer_amount<second_balance) {
					System.out.println("Insufficient balance");
				}else {

					pstmt.setInt(1,final_balance_fund_1);
					pstmt.setString(2, second_account); 
					pstmt.executeUpdate(); 
					
					int final_balance_fund_2=first_balance-transfer_amount;
					pstmt.setInt(1,final_balance_fund_2);
					pstmt.setString(2, first_account); 
					pstmt.executeUpdate(); 
					
					System.out.println("Your updated balance is : "+final_balance_fund_2);
				}
				
				fromAccount=first_account;
				toAccount=second_account;
				transferAmount=transfer_amount;
				

				break;
			case 6:
				System.out.println("---------------Account Statement---------------");
				System.out.println("Transactions : ");
				System.out.println("FUND TRANSFER\nFrom Account : "+fromAccount+" To Account : "+toAccount+" Amount : "+transferAmount);
				System.out.println("\nDEPOSIT\nDeposite Amount : "+deposit_statement);
				System.out.println("\nWITHDRAW\nWithraw Amount : "+withdraw_statement);
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
