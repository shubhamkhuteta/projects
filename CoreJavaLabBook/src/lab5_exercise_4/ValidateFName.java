package lab5_exercise_4;

import java.util.Scanner;

class TestUserName extends Exception {
	private String un,pw;
	
	public TestUserName(String un, String pw)
	{
		this.un=un;
		this.pw=pw;
	}
	
	public String toString() {
		return "Username & Password can't be blank!";
	}
}


public class ValidateFName {
	static String username="capgemini";
	static String password="capgemini";
	
	static void validation(String un, String pw) throws TestUserName {
	 
			if(un.isEmpty() && pw.isEmpty())
			{
			throw new TestUserName(un,pw);
			}
			else {
			System.out.println("Welcome");
			}
	}
	public static void main(String[] args) throws TestUserName {
	
		String username_u,password_p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your username :");
		
		username_u=sc.nextLine();
		System.out.println("Enter your passwords :");
		password_p=sc.nextLine();
		
		ValidateFName.validation(username_u,password_p);
}
	
}
