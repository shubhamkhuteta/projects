package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.lang.Enum;


public class JunitEx2 {


	
	@Test
	public void testCase1() {
		System.out.println("1 Test Case !!");
	}
	@Test
	public void testCase2() {
		System.out.println("2 Test Case !!");
	}
	@Test
	public void testCase3() {
		System.out.println("3 Test Case !!");
	}
	@Test
	public void testCase4() {
		System.out.println("4 Test Case !!");
	}
	
	
	@Before
	public void beforTest() {
		System.out.println("Before Test Case !!");
		
	}
	@After
	public void afterTest() {
		System.out.println("After Test Case !!");
	}
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass Test Case !!");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass Test Case !!");
	}
	
}
