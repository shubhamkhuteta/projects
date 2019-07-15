package lemdaexpression;

import java.util.function.Function;

public class FunctionEx {
	public static void main(String[] args) {
		
		/*String str= "Shubham";
		Function<String,Integer> fun = i->i.length();;
		System.out.println(fun.apply(str));*/
		
		Function<Integer,Integer> fun1 = i->2*i;
		Function<Integer,Integer> fun2 = i->i*i*i;
		
		System.out.println(fun1.andThen(fun2).apply(2));
		
		System.out.println(fun1.compose(fun2).apply(2));
		
		
	}
}
