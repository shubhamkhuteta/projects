package lemdaexpression;

public class LemdaEx {
	public static void main(String[] args) {
		LemdaEx l = new LemdaEx();
		int a =l.add(10, 20);
		System.out.println("Sum is :"+a);
	}
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
}
