package WithCollection;

public class Account {

	private String account_no;
	private String name;
	private int balance=0;
	private String address;
	private String phoneno;
	private int pin;

	//Constructor

	public Account() {
		super();
	}

	//Getters and Setters

	public String getName() {
		return name;
	}
	public String getAccount_no() {
		return account_no;
	}
	public String setAccount_no(String string) {
		return this.account_no = string;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "Account Details \nName : " + name + "\nYour current balance : " + balance + "\nAddress : " + address + "\nPhoneno : " + phoneno ;
	}

}
