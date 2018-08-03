package com.cg.test.add;

import org.junit.Assert;
import org.junit.Test;

import com.cg.test.TestClass;

public class DivisionTest {
//different methods to test with different conditions
	@Test
	public void testDivisionTwoPositive() {
		TestClass cal = new TestClass();
		double ans = cal.division(4, 2);
		Assert.assertEquals(2, ans, 0);
	}

	@Test
	public void testMultiplicationTwoNegative() {
		TestClass cal = new TestClass();
		double ans = cal.division(-2, -2);
		Assert.assertEquals(1, ans, 0);
	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void testTwoZero() {
		TestClass cal = new TestClass();
		double ans = cal.division(0, 0);
		Assert.assertEquals(0, ans,0);
	}

	@Test
	public void testNumeratorZero() {
		TestClass cal = new TestClass();
		double ans = cal.division(0, 10);
		Assert.assertEquals(0, ans, 0);
	}

	@Test

	public void testOnePositiveOneNegative() {
		TestClass cal = new TestClass();
		double ans = cal.division(12, -2);
		Assert.assertEquals(-6, ans, 0);
	}

}
