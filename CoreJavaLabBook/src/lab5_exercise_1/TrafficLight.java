package lab5_exercise_1;

import java.util.Scanner;

public class TrafficLight {
	static String yellow="Ready";
	static String red="Stop";
	static String green="Go";
	static int input=0;
	public static void main(String[] args) {
		
		System.out.println("Please select one:\n1. Yellow\n2. Stop\n3.Green\n\n");
		Scanner sc=new Scanner(System.in);
		input=sc.nextInt();
		
		if(input==1) {
			System.out.println(yellow);
		}
		
		else if(input==2) {
			System.out.println(red);
		}else {
			System.out.println(green);
		}
	}
}
