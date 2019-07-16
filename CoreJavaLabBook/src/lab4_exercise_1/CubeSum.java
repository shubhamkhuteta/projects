package lab4_exercise_1;

import java.util.Scanner;

public class CubeSum 
{
	public static void main(String[] args) 
	{
	    int input=0;
	    int num1,num2,num3,c=0,t;

	    //read the number
	    System.out.println("Enter a Number");
	    Scanner console = new Scanner(System.in);
	    input= Integer.parseInt(console.nextLine());

	    int number = input; //number is a temp variable
	    int counter = 0; //
	    while(number>0)
	    {
	         t= number%10;
	         c+= t*t*t;
	        counter = counter+1;
	        number = number/10;
	    }
	    System.out.println("Answer is : "+c);
	}
}
