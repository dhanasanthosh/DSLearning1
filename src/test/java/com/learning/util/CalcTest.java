package com.learning.util;

import org.junit.*;

public class CalcTest {
	private Calc calcObj;

	@Before
	public void setup() {
		calcObj = new Calc();
	}

	@After
	public void tearDown() {
		calcObj = null;
	}

	@Test
	public void testAddPositiveNos() {
		Integer result = calcObj.add(5, 6);
		Assert.assertEquals(result, new Integer(11));
	
	}

	@Test
	public void testAddNegativeNos() {
		Integer result = calcObj.add(-5, -6);
		Assert.assertEquals(result, new Integer(-11));
	
	}

}
