package com.assignment3_1.Assignment3_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	
	Calculator testObj;
	long ans, nums, expected, actual;
	
	

	@Before
	public void setUp() throws Exception {
		ans = 15 * -4 * 16 * 3;
		testObj = new Calculator();
		expected = ans;
		actual = testObj.product(15, -4, 16, 3);
		
	}

	@Test
	public void test() {
		assertEquals(expected, actual);

	}
	
	@After
	public void tearDown() throws Exception {
		testObj = null;
		
		
	}



}
