package com.xyz;
import junit.framework.Assert;
import org.junit.Test;

	@SuppressWarnings("deprecation")
	public class CalculatorTest {
		
		@Test
		public void testsum() {
			Calculator test = new Calculator();
			int result = test.sum(2, 2);
			Assert.assertEquals(4, result);
		}

		@Test
		public void testsub() {
			Calculator test = new Calculator();
			int result = test.sub(2, 2);
			Assert.assertEquals(0, result);
		}
	
		@Test
		public void testmul() {
			Calculator test = new Calculator();
			int result = test.mul(2, 2);
			Assert.assertEquals(4, result);
		}
		
		@Test
		public void testDivide() {
			Calculator Calculator = new Calculator();
			Assert.assertEquals(2, Calculator.divide(6, 3));
		}

		@Test(expected = ArithmeticException.class)
		public void testDivideWillThrowExceptionWhenDivideOnZero() {
			Calculator Calculator = new Calculator();
			Calculator.divide(6, 0);
		}
	}