package lemdaexpression;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

class Empl1{
	int sal;
	String name;
	@Override
	public String toString() {
		return "Empl1 [sal=" + sal + ", name=" + name + "]";
	}
	public Empl1(int sal, String name) {
		super();
		this.sal = sal;
		this.name = name;
	}
	
	
}
public class BiPredicateEx {
	public static void main(String[] args) {
		ArrayList<Empl1> al = new ArrayList<Empl1>();
		BiConsumer<Empl1,Integer> bc = (emp,sal1) -> emp.sal=emp.sal+sal1;
		al.add(new Empl1(1000, "Shubham"));
		al.add(new Empl1(2000, "Raghav"));
		al.add(new Empl1(3000, "Pankaj"));
		al.add(new Empl1(1500, "Sanskar"));
		for(Empl1 e :al) {
			bc.accept(e, 2000);
		}
		System.out.println(al);
		
	}
}
