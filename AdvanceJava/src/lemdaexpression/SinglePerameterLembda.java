package lemdaexpression;

import java.util.Scanner;

@FunctionalInterface

interface FunctionalInter{
	//public int add(int a);
	public int add(int a);
	
}

public class SinglePerameterLembda {

	public static void main(String[] args) {
		
		//Single Parameter
		//FunctionalInter fi = (a)->{return a;};
		//System.out.println(fi.add(12));
		
		//Multi Parameter
		//FunctionalInter fi = (a,b)->{return a+b;};
		//System.out.println(fi.add(12, 14));
		
		//With Scanner
		//Scanner scanner = new Scanner(System.in);
		//FunctionalInter fi = (a)->{a = scanner.nextInt();int b= scanner.nextInt();return a+b;};
		//System.out.println(fi.add(0));
		
		
	}
	
}
