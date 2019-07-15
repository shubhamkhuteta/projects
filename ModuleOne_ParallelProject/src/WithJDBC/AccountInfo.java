package WithJDBC;

import java.sql.Date;

public class AccountInfo {

	private String account_no;
	private String name;
	private int balance=0;

	private String phoneno;
	private int pin;
	
	private String transaction_type;

	//Constructor


	public AccountInfo() {
		super();
	}

	//Getters and Setters

	

	@Override
	public String toString() {
		return "Account Details \nName : " + name + "\nYour current balance : " + balance + "\nPhoneno : " + phoneno ;
	}


	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	
	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

}

