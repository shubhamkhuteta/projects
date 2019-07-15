package lemdaexpression;

import java.util.function.Predicate;

public class Predicate2 {
	public static void main(String[] args) {
		String str[] = {"Shubham","Raghav","Sanskar","Pankaj","Ramesh"};
		
		Predicate<String> pre =s-> s.length()%2==0;
		for(String s1 : str) {
			if(pre.test(s1)) {
				System.out.println(s1);
			}
		}
	}
}
