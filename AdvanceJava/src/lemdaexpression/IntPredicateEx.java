package lemdaexpression;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;



public class IntPredicateEx {
	public static void main(String[] args) {
		
		int a[] = {12,43,12,45,67,32,43,56,23};
		IntPredicate pre = s-> s<20;
		for(Integer i1 : a) {
			if(pre.test(i1)) {
				System.out.println("With Int Predicate : "+i1);
			}
		}
		

		double a1[] = {12.12,43.00,12.11,23.10};
		DoublePredicate predicate = (d) -> d > 13.0;
		for(Double i2 : a1) {
			if(predicate.test(i2)) {
				System.out.println("With Double Predicate : "+i2);
			}
		}
		
		for(Double i2 : a1) {
			if(predicate.test(i2)) {
				System.out.println("With Double Predicate : "+i2);
			}
		}
		
	}
}

