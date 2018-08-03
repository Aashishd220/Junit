package com.cg.test.add;

import com.cg.test.TestClass;
import org.junit.Assert;
import org.junit.Test;

public class SubtractionTest {

	//different method to test with different conditions
	@Test
	public void testSubtractTwoPositive() {
		TestClass cal = new TestClass();
		double ans = cal.subtract(4, 2);
		Assert.assertEquals(2, ans, 0);
	}

	@Test
	public void testTwoNegative() {
		TestClass cal = new TestClass();
		double ans = cal.subtract(-2, -2);
		Assert.assertEquals(0, ans, 0);
	}

	@Test

	public void testTwoZero() {
		TestClass cal = new TestClass();
		double ans = cal.subtract(0, 0);
		Assert.assertEquals(0, ans, 0);
	}

	@Test

	public void testFirstPositiveSecondNegative() {
		TestClass cal = new TestClass();
		double ans = cal.subtract(12, -2);
		Assert.assertEquals(14, ans, 0);
	}

	@Test

	public void testFirstNegativeSecondPositive() {
		TestClass cal = new TestClass();
		double ans = cal.subtract(-12, 2);
		Assert.assertEquals(-14, ans, 0);
	}

}
