package com.cg.test.add;

import org.junit.Assert;
import org.junit.Test;

import com.cg.test.TestClass;

public class MultiplicationTest {
//different method to test with different conditions
	@Test
	public void testMultiplicationTwoPositive() {
		TestClass cal = new TestClass();
		double ans = cal.multiply(4, 2);
		Assert.assertEquals(8, ans, 0);
	}

	@Test
	public void testMultiplicationTwoNegative() {
		TestClass cal = new TestClass();
		double ans = cal.multiply(-2, -2);
		Assert.assertEquals(4, ans, 0);
	}

	@Test

	public void testTwoZero() {
		TestClass cal = new TestClass();
		double ans = cal.multiply(0, 0);
		Assert.assertEquals(0, ans, 0);
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
		double ans = cal.multiply(12, -2);
		Assert.assertEquals(-24, ans, 0);
	}

}
