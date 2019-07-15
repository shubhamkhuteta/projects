package lemdaexpression;
@FunctionalInterface
interface FI{
	int method1(int a);
	default boolean method2() {
		System.out.println("Default Method 1");
		return false;
	}
	default boolean method3() {
		System.out.println("\nDefault Method 2");
		return true;
	}
}

public class DefaultMethod implements FI{
	public static void main(String[] args) {
		DefaultMethod dm = new DefaultMethod();

		System.out.println("Method One with int return type  : "+dm.method1(0));
		System.out.print("Default method one : "+dm.method2());
		System.out.print("Default method two : "+dm.method3());
	}

	@Override
	public int method1(int a) {
		// TODO Auto-generated method stub
		return 100;
	}
}
