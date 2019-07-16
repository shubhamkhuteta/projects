package lemdaexpression;

import java.util.function.Predicate;

public class PredicateExample  {

	public static void main(String[] args) {
		Predicate<Integer>  preInt = i -> i%2==0;
		System.out.println(preInt.test(12));
		System.out.println(preInt.test(76));
		
		Predicate<String>  preStr = i -> i=="";
		System.out.println(preStr.test(""));
		System.out.println(preStr.test(""));
	}
	

}
