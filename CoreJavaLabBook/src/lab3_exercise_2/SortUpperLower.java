package lab3_exercise_2;

import java.util.Arrays;
import java.util.Scanner;

public class SortUpperLower {
	static int n;
	static String temp,x;
	
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		temp=sc.nextLine();
		int an = temp.length();
		String a[]  = new String [an];
		
		
		System.out.println("Enter the String :"+a[an]);*
		
		/
		 * 
	
	
		 */
		/*for (int i = 0; i < an; i++) 
        {
            for (int j = i + 1; j < an; j++) 
            {
                if (a[i] < a[j]) 
                {
                    x = temp;
                    temp = a[j];
                    a[j] = x;
                }
            }
        }*/
		/*for (int i = 0; i < n; i++) 
	        {
	        	
	            a[i] = sc.nextInt();
	        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String a = sc.nextLine();
        char[] charArray = a.toCharArray();
        Arrays.sort(charArray);
        System.out.println("Sorted string " + String.valueOf(charArray));
        
        
        
        
	}
	
	
}
