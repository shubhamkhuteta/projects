package lab1_exercise_4;

import java.util.Scanner;

public class PowerofTwo {
	   static boolean checkNumber(int n) 
	    { 
	        if (n == 0) 
	            return false; 
	          
	        while (n != 1) 
	        { 
	            if (n % 2 != 0) 
	                return false; 
	            n = n / 2; 
	        }
	        return true; 
	    } 
	  
	    // Main Method
	    public static void main(String args[]) 
	    { 
	        if (checkNumber(2)) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 
	  
	        if (checkNumber(4)) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 
	    } 
}



