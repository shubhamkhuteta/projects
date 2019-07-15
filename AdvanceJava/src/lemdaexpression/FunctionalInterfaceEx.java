package lemdaexpression;

import java.util.Scanner;

@FunctionalInterface
interface AddInterface{
	public String add(String name);
	

}

public class FunctionalInterfaceEx {
		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name=sc.next();
		//Lambda Expression
		AddInterface fs=(String a)->{String c=Integer.toString(a.length());return c;};
		String x =fs.add(name);
		System.out.println("Length of the value : "+x);sc.close();}
		
}
