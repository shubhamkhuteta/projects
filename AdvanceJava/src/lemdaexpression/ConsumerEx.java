package lemdaexpression;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerEx {
	public static void main(String[] args) {
		/*Consumer<String> con = i-> System.out.println(i);
		con.accept("Hello");*/
		
		Supplier<String> sup = ()->{
			String otpNum="";
			for(int i = 0; i<6;i++) {
			otpNum=otpNum+(int)(Math.random()*10);
			}return otpNum; 
			
		};
		System.out.println(sup.get());
	
}
}