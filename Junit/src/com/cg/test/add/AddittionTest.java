
package com.cg.test.add;

import org.junit.Assert;
import org.junit.Test;

import com.cg.test.TestClass;

public class AddittionTest {

	@Test//to check sum of two positive
	public void testAddTwoPositive() {
		TestClass cal = new TestClass();
		double ans = cal.add(2, 3);
		Assert.assertEquals(5, ans, 0);
	}

	@Test//to check sum of two negative
	public void testTwoNegative() {
		TestClass cal = new TestClass();
		double ans = cal.add(-2, -2);
		Assert.assertEquals(-4, ans, 0);
	}

	@Test//to check two zeroes
	public void testTwoZero() {
		TestClass cal = new TestClass();
		double ans = cal.add(0, 0);
		Assert.assertEquals(0, ans, 0);
	}

	@Test//to check greater positive
	public void testGreaterPositiveSmallerNegative() {
		TestClass cal = new TestClass();
		double ans = cal.add(12, -2);
		Assert.assertEquals(10, ans, 0);
	}

	@Test//to check greater negative
	public void testGreaterNegativeSmallerPositive() {
		TestClass cal = new TestClass();
		double ans = cal.add(-12, 2);
		Assert.assertEquals(-10, ans, 0);
	}

}
