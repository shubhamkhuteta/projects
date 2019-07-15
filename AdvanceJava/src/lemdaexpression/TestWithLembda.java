package lemdaexpression;public class TestWithLembda
{
	public static void main(String[] args) {
		Runnable r=()->{
					System.out.println("Lembda with runnable");
				  };
		Thread t = new Thread(r);
		t.start();
	}
}