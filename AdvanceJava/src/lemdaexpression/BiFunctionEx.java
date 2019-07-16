package lemdaexpression;

import java.util.ArrayList;
import java.util.function.BiFunction;



class Empl11{
	int sal;
	String name;
	@Override
	public String toString() {
		return " Salary :"+sal;
	}
	public Empl11(int sal, String name) {
		super();
		this.sal = sal;
		this.name = name;
	}
	
	
}
public class BiFunctionEx {
	public static void main(String[] args) {
		ArrayList<Empl11> al = new ArrayList<Empl11>();
		BiFunction<Empl11,Integer,Integer> bc = (emp,sal1) -> emp.sal=emp.sal+2000;          
		al.add(new Empl11(1000, "Shubham"));
		al.add(new Empl11(2000, "Raghav"));
		al.add(new Empl11(3000, "Pankaj"));
		al.add(new Empl11(1500, "Sanskar"));
		for(Empl11 e :al) {
			int i = bc.apply(e, 1000);
			System.out.println("Salary : "+i);
			
		}
		
		
	};
}
