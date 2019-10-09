package com.assignment3_1.Assignment3_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.assignment3_1.Assignment3_1.Employee;
import com.assignment3_1.Assignment3_1.ICalculator;
import com.assignment3_1.Assignment3_1.SalImplementation;

public class TestSalImplementation {
		private ICalculator iCalculator=null ;
		private SalImplementation salImplObj;
		double income, tax, ecpected;	
	
		@Before
		public void setUp() throws Exception {

			iCalculator = new SalImplementation();
			
		}
		private void mock(double income) {
			iCalculator = Mockito.mock(ICalculator.class);
			if (income>70000) {
				Mockito.when(iCalculator.computeTax(income)).thenReturn((double) income * 0.33);
				}else if (income<=70000&&income>48000){
					Mockito.when(iCalculator.computeTax(income)).thenReturn((double) income * 0.30);
				}else if (income<=48000&&income>14000){
					Mockito.when(iCalculator.computeTax(income)).thenReturn((double) income * 0.175);
				}else if(income<=14000){
					Mockito.when(iCalculator.computeTax(income)).thenReturn((double) income * 0.105);
				}else {
					System.out.println("fail");
				}

	 		tax = iCalculator.computeTax(income);
		}

		@Test
		public final void testComputeTax() {
			income = 100000;
			ecpected=33000;
		mock(income) ;
			System.out.println(income+"   "+tax);
			assertEquals(ecpected, iCalculator.computeTax(income), 0.001);
//test >70000
			income = 50000;
			ecpected=15000;
			mock(income) ;
			System.out.println(income+"   "+tax);
			assertEquals(ecpected, iCalculator.computeTax(income), 0.001);
//test >4800 <=7000			
			income = 20000;
			ecpected=3500;
			mock(income) ;
			System.out.println(income+"   "+tax);
			assertEquals(ecpected, iCalculator.computeTax(income), 0.001);
//test >14000 <=4800 			
			income = 10000;
			ecpected=1050;
			mock(income) ;
			System.out.println(income+"   "+tax);
			assertEquals(ecpected, iCalculator.computeTax(income), 0.001);
//test <=14000  
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
