package lab1_exercise_2;

import java.util.Scanner;

public class FindDifference {
	public static void main(String[] args) {
		int n=0;
	    System.out.println("Enter the value of N:");
	    Scanner sc=new Scanner(System.in);
	    
	    //asking for value of n
	    n=sc.nextInt();
		
	    
	    int res = 0;
		//printing the sum 
	    System.out.println("\n\nDifference is : "+calculateDifference(res));
	}
	
	static int calculateDifference(int n) {
		n=0;
		int i=0;
		int sum=0;
		int res=0;
		
		for(i=0;i<=n;i++) {
			 
			res=(i*i) - ((sum+=i*i));
		}
			 return res;
		
	}
}
