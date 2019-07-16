package lab1_exercise_1;

import java.util.Scanner;

public class ClassSum {
	//Main Method
	public static void main(String[] args) {
		
		int n=0;
	    System.out.println("Enter the value of N:");
	    Scanner sc=new Scanner(System.in);
	    
	    //asking for value of n
	    n=sc.nextInt();
		
	    
	    //printing the sum of n number which is divisible by 3 and 5
	    System.out.println("\n\nSum of n natural number (Divisible by 3 & 5) : "+calculateSum(n));
	}
	
	//Calculate Sum
	static int calculateSum(int n)
	{
		int i=0, sumofn=0;
		//Declaring Variables and initializing them
	    for(i=0;i<=n;i++) {
	    	if(i%3==0 || i%5==0)
	    	{
	    		sumofn+=i;
	    	}
	    	else {
	    		continue;
	    	}
	    }
		return sumofn;
	}
}
