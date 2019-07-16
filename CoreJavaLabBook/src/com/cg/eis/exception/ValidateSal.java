package com.cg.eis.exception;

import java.util.Scanner;

class EmployeeException extends Exception{
private int sal;
	
	public EmployeeException(int sal)
	{
		this.sal=sal;
	}
	
	public String toString() {
		return "Salary is less than 3000";
	}
}

public class ValidateSal {
	static int salary=0;
	
	static void validation(int sal) throws EmployeeException {
	 
			if(sal<3000)
			{
			throw new EmployeeException(salary);
			}
			else {
			System.out.println("You got promotion !!");
			}
	}
	public static void main(String[] args) throws EmployeeException {
	
		int salary=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary :");
		
		salary=sc.nextInt();

		
		ValidateSal.validation(salary);
		sc.close();
	}
	
}