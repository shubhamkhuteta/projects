package lab5_exercise_3;

import java.util.Scanner;

class PrimeNumberTest extends Exception{
private int num;
	
	public PrimeNumberTest(int num)
	{
		this.num=num;
	}
	
	public String toString() {
		return "Please enter an Integer !!";
	}
}

public class PrimeNumbers {
	static int num=0,i=0,temp=0;
	static boolean ans;
	
	static void validation(int num) throws PrimeNumberTest {
	 
		
		//If isPrime is true then the number is prime else not

			throw new PrimeNumberTest(num);

		
	}
	public static void main(String[] args) throws PrimeNumberTest {
	
		int num=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		num=sc.nextInt();
		
		for(int i=2;i<=num/2;i++)
		{
	       temp=num%i;
		   if(temp==0)
		   {
		      ans=false;
		      break;
		   }
		}
		
		PrimeNumbers.validation(num); 
		sc.close();
	}
	
}
