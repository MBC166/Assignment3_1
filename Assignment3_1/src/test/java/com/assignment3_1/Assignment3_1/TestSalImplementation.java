package com.assignment3_1.Assignment3_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestSalImplementation {
	
	SalImplementation salImplObj;
	ICalculator mockObj;
	
	
	int income, tax;
	int expected, actual;
	
	

	@Before
	public void setUp() throws Exception {
		salImplObj= new SalImplementation();
			income =70000;
			mockObj = Mockito.mock(ICalculator.class);
			
			Mockito.when(mockObj.computeTax(income)).thenReturn(income);
			salImplObj.setObj(mockObj);
			
			expected =income ;
			actual = salImplObj.computeTax(income);
			
			
			
	}
	
	@Test
	public void testAdd() {
	 		assertEquals(expected, actual);
			
	}
	

	@After
	public void tearDown() throws Exception {
		salImplObj = null;
		
	}

	@Test
	public void test() {
		
	}

}
