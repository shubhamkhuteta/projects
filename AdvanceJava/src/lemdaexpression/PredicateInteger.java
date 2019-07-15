package lemdaexpression;

import java.util.function.Predicate;

public class PredicateInteger {
	public static void main(String[] args) {
		Integer inte[] = {1,2,3,4,5,12,23,34,56,78,54,23,6,7,8};
		
		Predicate<Integer> pre1 = i -> i%2==0;
		Predicate<Integer> pre2 = i -> i>10;
		
		System.out.println("Result : ");
		for(int i1:inte) {
			/*if(pre1.and(pre2).test(i1)) {
				System.out.println("First"+i1);
			}*/
			if(pre1.negate().test(i1)){
				System.out.println("Second : \n"+i1);
			}
			if(pre1.or(pre2).test(i1)) {
				System.out.println("Third \n: "+i1);
			}
		}
		
	}
}
