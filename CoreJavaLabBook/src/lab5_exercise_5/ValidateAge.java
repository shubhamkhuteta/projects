package lab5_exercise_5;

import java.util.Scanner;

class ValidateAgeTest extends Exception{
	private int age;
	
	public ValidateAgeTest(int age){
		this.age=age;
	}
	
	public String toString() {
		return "Sorry, you are under 15. Your age is : "+age;
	}
}

public class ValidateAge {
	public static void main(String[] args) throws ValidateAgeTest{
		int userage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age :");
		
		userage=sc.nextInt();
		
		ValidateAge.validation(userage);
	}
	
	static void validation(int userage) throws ValidateAgeTest{
		if(userage<=15) {
			throw new ValidateAgeTest(userage);
		}
		else {
			System.out.println("You are adult now!");
		}
	}
}