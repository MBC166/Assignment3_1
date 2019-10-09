package com.assignment3_1.Assignment3_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.assignment3_1.Assignment3_1.Employee;
import com.assignment3_1.Assignment3_1.ICalculator;
import com.assignment3_1.Assignment3_1.SalImplementation;

public class TestSalImplementation2 {
		private ICalculator iCalculator;
		private SalImplementation salImplObj;
		double income, tax, ecpected;	
	
	
		@Before
		public void setUp() throws Exception {

			salImplObj = new SalImplementation();
			
		}

		@Test
		public final void testComputeTax() {
			income = 100000;
			ecpected=33000;
			assertEquals(ecpected, salImplObj.computeTax(income), 0.001);

		}

	//	
	//
//		@Test
//		public final void testWeeklySalary() {
//		}
	//
//		@Test
//		public final void testFortnightSalary() {
//		}
	//
//		@Test
//		public final void testComputeKiwiSaver() {
//		}
	//
//		@Test
//		public final void testSetObj() {
//		}

		@After
		public void tearDown() throws Exception {
		}

	}	
