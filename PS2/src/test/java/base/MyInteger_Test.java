package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	
	// testing the first 3 non-static methods
	
	public void testIsEven() {
		int i = 4;
		assertTrue(MyInteger.isEven(i));
	}
	
	
	public void testIsOdd() {
		int i = 5;
		assertTrue(MyInteger.isOdd(i));
	}
	
	public void testIsPrime() {
		int i = 5;
		assertTrue(MyInteger.isPrime(i));
	}
	
	

	
}
