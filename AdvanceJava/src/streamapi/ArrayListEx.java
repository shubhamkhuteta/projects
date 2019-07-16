package streamapi;

import java.util.ArrayList;
import java.util.Iterator;
class ArrayTest{
	int id;
	String name;
	int sal;
	public ArrayTest(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "ArrayTest [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<ArrayTest> al = new ArrayList<ArrayTest>();
		
		al.add(new ArrayTest(12,"Shubham", 10000));
		
		
		
		Iterator<ArrayTest> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
