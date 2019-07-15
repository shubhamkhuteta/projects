package lemdaexpression;
@FunctionalInterface
interface functionalEx{
	
	public static void staticMethod() {
	}
	
	public void defaultMethod();
}

public class StaticMethod implements functionalEx{
	public static void main(String[] args) {
		StaticMethod sm = new StaticMethod();
		sm.defaultMethod();
		functionalEx.staticMethod();
	}

	@Override
	public void defaultMethod() {
		System.out.println("Default Method of Functional Interface!!");
		
	}
	
	public void staticMethod() {
		System.out.println("Default Method of Functional Interface!!");
		
	}
}
