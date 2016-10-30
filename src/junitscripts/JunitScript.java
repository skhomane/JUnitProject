package junitscripts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitScript {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is called before class.");
	}	

	@Before
	public void setUp() throws Exception {
		System.out.println("This is called before unit test method.");
	}
	
	@Test
	public void test() {
		System.out.println("This is called actually unit test.");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is called after unit test method.");
	}	
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is called after class.");
	}

}
