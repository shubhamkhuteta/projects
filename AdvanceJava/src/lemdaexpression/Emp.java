package lemdaexpression;

import java.util.ArrayList;
import java.util.function.Predicate;

class EmpBean {
	int id;
	int sal;
	String name;

	public EmpBean(int id, int sal, String name) {
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmpBean [id=" + id + ", sal=" + sal + ", name=" + name + "]";
	}
	
}

public class Emp{
	public static void main(String[] args) {
	
		ArrayList<EmpBean> al = new ArrayList<>();

		al.add(new EmpBean(12,2000,"Shubham"));
		al.add(new EmpBean(10,5000,"Pankaj"));
		al.add(new EmpBean(11,1000,"Raghav"));
		al.add(new EmpBean(14,2000,"ramesh"));
		
		Predicate<EmpBean> pre = e -> e.sal>3000;
		
		for(EmpBean emp: al) {
			if(pre.test(emp)) {
			System.out.println(emp);
		}}
		
	}
}

