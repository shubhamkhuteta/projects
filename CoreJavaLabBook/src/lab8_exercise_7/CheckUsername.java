package lab8_exercise_7;

import java.util.Scanner;

public class CheckUsername {
	public static void main(String[] args) {
		String username;
		boolean re = false,res= false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your username : ");
		username=sc.nextLine();
	
		for(int i =0; i<=username.length();i++)
		{
			re=username.endsWith("_job");
			
		}
		if(re==true) {
			System.out.println("Username is correct!!");
		}else {
			System.out.println("Please check your username!!");
		}
		
		if(username.length()<=13) {
			System.out.println("Username should contain more than 8 characters");
		}else {
			System.out.println("You can login now!!");
		}
	}
}
