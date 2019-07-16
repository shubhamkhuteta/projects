package streamapi;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthScrollBarUI;

interface Inter{
	int add(int a,int b);
}
public class referencemethod {
	public int sum(int a ,int b) {
		return a-b;
	}
	public static void main(String[] args) {
		
		referencemethod rm =new referencemethod();
		Inter inter = (a,b) -> {
			return a+b;
		};
		
		System.out.println(inter.add(12, 14));
		
		Inter inter2 = rm::sum;
		System.out.println(inter2.add(17, 19));
		
		ArrayList<Integer> ae = new ArrayList<Integer>();
		ae.add(12);
		ae.add(56);
		ae.add(34);
		ae.add(67);
		ae.add(89);
		ae.add(36);
		ae.add(25);
		System.out.println("List is : "+ae);
		ae.stream().forEach(System.out::println);
		
	}
}
