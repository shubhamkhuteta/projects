package junit;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class JUnitEx {
	Add t = new Add();
	
	int i = t.sum(100,20);
	
	int j = 120;
	
	@Before
	public void testSum0() {
		System.out.println("Sum is : "+i+"="+j);
		Assert.assertEquals(i, j);
	}
	
	@Test
	public void testSum() {
		System.out.println("Sum is : "+i+"="+j);
		Assert.assertEquals(i, j);
	}
	
	@Test
	public void testSum1() {
		System.out.println("Sum is : "+i+"="+j);
		Assert.assertEquals(i, j);
	}
	@Test
	public void testSum2() {
		System.out.println("Sum is : "+i+"="+j);
		Assert.assertEquals(i, j);
	}
	@Test
	public void testSum3() {
		System.out.println("Sum is : "+i+"="+j);
		Assert.assertEquals(i, j);
	}
	
	
	
	
}
